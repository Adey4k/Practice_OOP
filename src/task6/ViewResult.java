package task6;

import java.io.IOException;

/**
 * Реалізація інтерфейсу View для роботи з результатами обчислень.
 */
class ViewResult implements View {
    Calc calc;

    public ViewResult(Calc calc) {
        this.calc = calc;
    }

    @Override
    public void viewShow() {
        calc.show();
    }

    @Override
    public void viewInit() {
        calc.init(Math.random() * 360, Math.random() * 360, Math.random() * 360, Math.random() * 360);
    }

    @Override
    public void viewSave() throws IOException {
        calc.save();
    }

    @Override
    public void viewRestore() throws Exception {
        calc.restore();
    }
}
