package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Головний клас програми.
 */
public class Main {
    private Calc calc = Calc.getInstance();
    private UndoManager undoManager = UndoManager.getInstance(calc);
    private View view = new ViewTable(calc);

    private void menu() {
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore, 'u'ndo: ");

            try {
                s = in.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e);
                return;
            }

            if (s.length() != 1) continue;

            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    view.viewShow();
                    break;
                case 'g':
                    undoManager.saveState();
                    calc.init(Math.random() * 360, Math.random() * 360, Math.random() * 360, Math.random() * 360);
                    view.viewShow();
                    break;
                case 's':
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Serialization error: " + e);
                    }
                    System.out.println("Saved!");
                    break;
                case 'r':
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    view.viewShow();
                    break;
                case 'u':
                    if (undoManager.undo()) {
                    view.viewShow();
                    }
                    break;    
                default:
                    System.out.println("Wrong command.");
            }
        } while (!s.equals("q"));
    }

    public static void main(String[] args) {
        new Main().menu();
    }
}
