package task4;

/**
 * Інтерфейс для створення об'єктів View.
 */
interface Viewable {
    View getView();
}

/**
 * Фабрика для створення об'єктів ViewResult.
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
