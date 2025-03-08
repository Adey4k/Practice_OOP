/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author Ladik
 */
class ViewableTable implements Viewable {
    private Calc calc;

    public ViewableTable(Calc calc) {
        this.calc = calc;
    }

    @Override
    public View getView() {
        return new ViewTable(calc);
    }
}

