package task5;

import java.io.*;
import java.util.ArrayList;

/**
 * Клас для виконання обчислень та серіалізації результатів.
 */
public class Calc {
    private static Calc instance;
    private static final String FNAME = "Item2d.bin";
    private ArrayList<Item2d> results = new ArrayList<>();

    // Приватний конструктор для Singleton
    private Calc() {}

    // Потокобезпечний Singleton (double-checked locking)
    public static Calc getInstance() {
        if (instance == null) {
            synchronized (Calc.class) {
                if (instance == null) {
                    instance = new Calc();
                }
            }
        }
        return instance;
    }

    public void init(double n1, double n2, double n3, double n4) {
        int intY = calc(n1, n2, n3, n4);
        results.add(new Item2d(n1, n2, n3, n4, intY));
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
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME))) {
            os.writeObject(results);
        }
    }

    public void restore() throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME))) {
            Object obj = is.readObject();
            if (obj instanceof ArrayList<?>) {
                if (obj instanceof ArrayList<?>) {  // Перевіряємо, що це ArrayList
    results = new ArrayList<>();
    for (Object o : (ArrayList<?>) obj) {
        if (o instanceof Item2d) {  // Перевіряємо, що всередині Item2d
            results.add((Item2d) o);
        } else {
            throw new ClassCastException("Invalid object type in deserialized list");
        }
    }
} else {
    throw new ClassCastException("Deserialized object is not an ArrayList<Item2d>");
}

            } else {
                throw new ClassCastException("Deserialized object is not an ArrayList<Item2d>");
            }
        }
    }

    public ArrayList<Item2d> getResults() {
        return results;
    }
}
