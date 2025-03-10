package task6;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
/**
 * Клас для виконання обчислень та серіалізації результатів.
 */
public class Calc {
    private static Calc instance;
    private static final String FNAME = "Item2d.bin";
    private List<Item2d> results = Collections.synchronizedList(new ArrayList<>());

    // Приватний конструктор для Singleton
    private Calc() {}

    // Потокобезпечний Singleton
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
        results.forEach(System.out::println);
    }

    public void save() throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME))) {
            os.writeObject(results);
        }
    }

    public void restore() throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME))) {
            Object obj = is.readObject();
            if (obj instanceof List<?>) {
                results = ((List<?>) obj).stream()
                        .filter(o -> o instanceof Item2d)
                        .map(o -> (Item2d) o)
                        .collect(Collectors.toList());
            } else {
                throw new ClassCastException("Deserialized object is not a List<Item2d>");
            }
        }
    }

    public List<Item2d> getResults() {
        return results;
    }

    // Паралельний аналіз колекції через Worker Thread
public void analyzeParallel() {
        System.out.println("Starting parallel analysis...");

        IntSummaryStatistics totalOnesStats = results.parallelStream()
                .mapToInt(item -> {
                    int y = item.getY();
                    String binary = Integer.toBinaryString(Math.abs(y)); // Тільки значущі біти
                    int onesCount = Integer.bitCount(Math.abs(y)); // Кількість одиниць у значущих бітах
                    int additionalOnes = (y < 0) ? (32 - binary.length()) : 0; // Доповнювальні біти
                    int totalOnes = onesCount + additionalOnes;
                    return totalOnes;
                })
                .summaryStatistics();

        System.out.println("Analysis complete.");
        System.out.println("Min ones: " + totalOnesStats.getMin());
        System.out.println("Max ones: " + totalOnesStats.getMax());
        System.out.println("Average ones: " + Math.round(totalOnesStats.getAverage()));
    }
}
