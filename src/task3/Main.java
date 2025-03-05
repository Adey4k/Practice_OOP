package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Головний клас програми.
 */
public class Main {
    private View view;

    public Main(View view) {
        this.view = view;
    }

    private void menu() {
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore: ");
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
                    view.viewInit();
                    view.viewShow();
                    break;
                case 's':
                    try {
                        view.viewSave();
                    } catch (IOException e) {
                        System.out.println("Serialization error: " + e);
                    }
                    view.viewShow();
                    break;
                case 'r':
                    try {
                        view.viewRestore();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    view.viewShow();
                    break;
                default:
                    System.out.print("Wrong command. ");
            }
        } while (!s.equals("q"));
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        View view = new ViewableResult(calc).getView();
        new Main(view).menu();
    }
}
