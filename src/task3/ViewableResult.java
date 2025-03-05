package task3;

/**
 * Фабрика для створення об'єктів ViewResult.
 */
interface Viewable {
    View getView();
}

class ViewableResult implements Viewable {
    private Calc calc;

    public ViewableResult(Calc calc) {
        this.calc = calc;
    }

    @Override
    public View getView() {
        return new ViewResult(calc);
    }
}
