/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Головний клас програми.
 */
public class Main {
    private static Calc calc = Calc.getInstance();
    private static View view = new ViewTable(calc);

    private static void menu() {
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore, 'u'ndo, 'e'xecute: ");

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
                    System.out.println("Undo not implemented yet.");
                    break;
                case 'e':
                    System.out.println("Executing parallel analysis...");
                    calc.analyzeParallel();
                    break;
                default:
                    System.out.println("Wrong command.");
            }
        } while (!s.equals("q"));
    }

    public static void main(String[] args) {
        menu();
    }
}
