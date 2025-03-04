package ex02;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Головний клас програми.
 */
public class Main {
    /** Об'єкт для виконання обчислень. */
    private Calc calc = new Calc();

     /**
     * Меню для взаємодії з користувачем.
     */
    private void menu() {
        String s = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore: ");
            try {
                s = in.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e);
                System.exit(0);
            }
            if (s.length() != 1) continue;

            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    System.out.println("View current.");
                    calc.show();
                    break;
                case 'g':
                    System.out.println("Random generation.");
                    double n1 = Math.random() * 360;
                    double n2 = Math.random() * 360;
                    double n3 = Math.random() * 360;
                    double n4 = Math.random() * 360;
                    calc.init(n1, n2, n3, n4);
                    calc.show();
                    break;
                case 's':
                    System.out.println("Save current.");
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                case 'r':
                    System.out.println("Restore last saved.");
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.print("Wrong command. ");
            }
        } while (s.charAt(0) != 'q');
    }
    
    /**
     * Точка входу в програму.
     */
    public static void main(String[] args) {
        new Main().menu();
    }
}
