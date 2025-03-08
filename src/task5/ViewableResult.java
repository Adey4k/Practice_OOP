package task5;

/**
 * Інтерфейс для створення об'єктів View.
 */
interface Viewable {
    View getView();
}

/**
 * Фабрика для створення об'єктів ViewResult.
 */
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
