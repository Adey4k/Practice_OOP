/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;
import java.io.Serializable;
/**
 * Клас для збереження вхідних даних та результатів обчислень.
 */
public class Item2d implements Serializable {
/** Аргументи вичісляємої функції. */
// transient
private double n1;
private double n2;
private double n3;
private double n4;
/** Двійкове представлення результату. */
private String binary;
/** Кількість одиниць у двійковому представленні. */
private int oneCount;
/** Результат обчислення. */
private int y;
/** Константа для серіалізації. */
private static final long serialVersionUID = 1L;
/** Конструктор за замовчуванням. */
public Item2d() {
n1 = .0;
n2 = .0;
n3 = .0;
n4 = .0;
y = 0;        
binary = "";
oneCount = 0;
}
    /**
     * Конструктор з параметрами.
     */
public Item2d(double n1, double n2, double n3, double n4, int y) {
this.n1 = n1;
this.n2 = n2;
this.n3 = n3;
this.n4 = n4;
this.y = y;
this.binary = Integer.toBinaryString(y);
this.oneCount = (int) binary.chars().filter(ch -> ch == '1').count();
}
    /** Встановлює вхідні параметри. */
public void setN(double n1, double n2, double n3, double n4) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.n4 = n4;
}

    /** Встановлює результат обчислення. */
public double getN1() {
return n1;
}
public double getN2() {
return n2;
}
public double getN3() {
return n3;
}
public double getN4() {
return n4;
}

public double setY(int y) {
return this.y = y;
}

public int getY() {
return y;
}

public void setBinary(String binary) {
        this.binary = binary;
    }

public String getBinary() {
    return Integer.toBinaryString(Math.abs(y));
}

    public void setOneCount(int oneCount) {
        this.oneCount = oneCount;
    }

    public int getOneCount() { return oneCount; }

    /** Встановлює всі параметри. */
public Item2d setXY(double n1, double n2, double n3, double n4, int y) {
this.n1 = n1;
this.n2 = n2;
this.n3 = n3;
this.n4 = n4;
this.y = y;
return this;
}
    /** Повертає рядкове представлення об'єкта. */
@Override
public String toString() {
return "n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3 + " n4 = " + n4 + ", y = " + y + "\n" + "y(binary) =" + binary + " ones(in y) = " + oneCount;
}
}