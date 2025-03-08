/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;
import java.io.Serializable;

/**
 * Клас для збереження вхідних даних та результатів обчислень.
 */
public class Item2d implements Serializable {
    /** Аргументи обчислюваної функції */
    private double n1, n2, n3, n4;
    /** Результат обчислення */
    private int y;
    /** Константа для серіалізації */
    private static final long serialVersionUID = 1L;

    /** Конструктор за замовчуванням */
    public Item2d() {
        n1 = n2 = n3 = n4 = 0.0;
        y = 0;
    }

    /** Конструктор з параметрами */
    public Item2d(double n1, double n2, double n3, double n4, int y) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.y = y;
    }

    /** Геттери */
    public double getN1() { return n1; }
    public double getN2() { return n2; }
    public double getN3() { return n3; }
    public double getN4() { return n4; }
    public int getY() { return y; }

/** Двійкове представлення `y`: 10 біт для додатних, 32 біти для від’ємних */
public String getBinary() {
    return (y >= 0) 
        ? String.format("%10s", Integer.toBinaryString(y)).replace(' ', '0')  // 10-бітне представлення
        : String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0'); // 32-бітний доповняльний код
}

    /** Кількість одиниць у двійковому представленні `y` */
    public int getOneCount() {
        return (int) getBinary().chars().filter(ch -> ch == '1').count();
    }

    /** Повертає рядкове представлення об'єкта */
    @Override
    public String toString() {
        return String.format("n1 = %.2f, n2 = %.2f, n3 = %.2f, n4 = %.2f, y = %d%n" +
                             "y(binary) = %s, ones(in y) = %d",
                             n1, n2, n3, n4, y, getBinary(), getOneCount());
    }
}
