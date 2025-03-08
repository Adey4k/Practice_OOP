/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author Ladik
 */
class ViewTable extends ViewResult {
    private static final String HEADER = "n1   | n2   | n3   | n4   | y       | y(binary)    | ones";
    
    public ViewTable(Calc calc) {
        super(calc);
    }

    @Override
public void viewShow() {
    System.out.println(HEADER);
    System.out.println("------------------------------------------------------------");
    for (Item2d item : calc.getResults()) {
        int y = item.getY();
        String binary = Integer.toBinaryString(Math.abs(y)); // Только значащие биты
        int onesCount = Integer.bitCount(Math.abs(y)); // Количество единиц в этом представлении

        // Подсчёт дополняющих битов
        String onesDisplay = (y < 0) ? onesCount + "(+" + (32 - binary.length()) + ")" : String.valueOf(onesCount);

        System.out.printf("%-4d | %-4d | %-4d | %-4d | %-7d | %-12s | %-4s\n",
            (int) item.getN1(), (int) item.getN2(), (int) item.getN3(), (int) item.getN4(),
            y, binary, onesDisplay);
    }
    System.out.println("------------------------------------------------------------");
}

}


