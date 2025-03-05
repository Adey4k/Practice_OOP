package task3;

import java.io.*;
import java.util.ArrayList;

/**
 * Клас для виконання обчислень та серіалізації результатів.
 */
public class Calc {
    private static final String FNAME = "Item2d.bin";
    private ArrayList<Item2d> results = new ArrayList<>();

    public void init(double n1, double n2, double n3, double n4) {
        int intY = calc(n1, n2, n3, n4);
        Item2d result = new Item2d(n1, n2, n3, n4, intY);
        results.add(result);
    }

    private int calc(double n1, double n2, double n3, double n4) {
        double rawY = (1000 * (Math.sin(Math.toRadians(n1)) +
                               Math.sin(Math.toRadians(n2)) +
                               Math.sin(Math.toRadians(n3)) +
                               Math.sin(Math.toRadians(n4)))) / 4;
        return (int) rawY;
    }

    public void show() {
        for (Item2d item : results) {
            System.out.println(item);
        }
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(results);
        os.flush();
        os.close();
    }

    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        results = (ArrayList<Item2d>) is.readObject();
        is.close();
    }

    public ArrayList<Item2d> getResults() {
        return results;
    }
}
