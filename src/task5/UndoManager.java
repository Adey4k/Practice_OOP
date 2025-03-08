/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author Ladik
 */
import java.util.Stack;

/**
 * Менеджер скасування(undo) операцій
 */

public class UndoManager {
    private static UndoManager instance;
    private Stack<Integer> undoStack = new Stack<>();
    private Calc calc;

    private UndoManager(Calc calc) {
        this.calc = calc;
    }

    public static UndoManager getInstance(Calc calc) {
        if (instance == null) {
            instance = new UndoManager(calc);
        }
        return instance;
    }

    public void saveState() {
        if (!calc.getResults().isEmpty()) {
            undoStack.push(calc.getResults().size() - 1);
        }
    }

    public boolean undo() {
        if (calc.getResults().isEmpty()) {
            System.out.println("There is nothing to undo.");
            return false;
        }

        int lastIndex = calc.getResults().size() - 1;
        calc.getResults().remove(lastIndex);
        System.out.println("Undo completed");
        return true;
    }
}




