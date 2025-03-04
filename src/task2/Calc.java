package ex02;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Клас для виконання обчислень та серіалізації результатів.
 */
public class Calc {
    private static final String FNAME = "Item2d.bin";
    private Item2d result;

    public Calc() {
        result = new Item2d();
    }

    public void setResult(Item2d result) {
        this.result = result;
    }

    public Item2d getResult() {
        return result;
    }

    /**
     * Виконує обчислення на основі вхідних параметрів.
     */
    private int calc(double n1, double n2, double n3, double n4) {
        double rawY = (1000 * (Math.sin(Math.toRadians(n1)) +
                               Math.sin(Math.toRadians(n2)) +
                               Math.sin(Math.toRadians(n3)) +
                               Math.sin(Math.toRadians(n4)))) / 4;
        return (int) rawY;
    }

    public void init(double n1, double n2, double n3, double n4) {
        result.setN(n1, n2, n3, n4);
        int intY = calc(n1, n2, n3, n4);
        result.setY(intY);
        result.setBinary(Integer.toBinaryString(Math.abs(intY)));
        result.setOneCount((int) result.getBinary().chars().filter(ch -> ch == '1').count());
    }

    public void show() {
        System.out.println(result);
    }

    /**
     * Зберігає поточний результат у файл.
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /**
     * Відновлює результат з файлу.
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d) is.readObject();
        is.close();
    }
}