/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author Ladik
 */
/**
 * Команда изменения данных с возможностью отмены.
 */
public class ChangeCommand implements Command {
    private Calc calc;
    private Item2d previousState;
    private double n1, n2, n3, n4;

    public ChangeCommand(Calc calc, double n1, double n2, double n3, double n4) {
        this.calc = calc;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    @Override
    public void execute() {
        if (!calc.getResults().isEmpty()) {
            previousState = calc.getResults().get(calc.getResults().size() - 1);
        }
        calc.init(n1, n2, n3, n4);
    }

    @Override
    public void undo() {
        if (previousState != null) {
            calc.getResults().remove(calc.getResults().size() - 1);
            calc.getResults().add(previousState);
        }
    }
}
