package ex02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;

/**
 * Виконує тестування розроблених класів.
 */
public class MainTest {


    /**
     * Перевіряє основну функціональність класу {@linkplain Calc}.
     */
    @Test
    public void testCalc() {
        Calc calc = new Calc();

        calc.init(0.0, 0.0, 0.0, 0.0);
        assertEquals(0, calc.getResult().getY());

        calc.init(90.0, 90.0, 90.0, 90.0);
        assertEquals(1000, calc.getResult().getY());

        calc.init(180.0, 180.0, 180.0, 180.0);
        assertEquals(0, calc.getResult().getY());

        calc.init(270.0, 270.0, 270.0, 270.0);
        assertEquals(-1000, calc.getResult().getY());

        calc.init(360.0, 360.0, 360.0, 360.0);
        assertEquals(0, calc.getResult().getY());
    }

    /**
     * Перевіряє бінарне представлення та кількість одиниць.
     */
    @Test
    public void testBinaryAndOnes() {
        Calc calc = new Calc();

        calc.init(90.0, 90.0, 90.0, 90.0);
        assertEquals("1111101000", calc.getResult().getBinary());
        assertEquals(6, calc.getResult().getOneCount());

        calc.init(180.0, 180.0, 180.0, 180.0);
        assertEquals("0", calc.getResult().getBinary());
        assertEquals(0, calc.getResult().getOneCount());

        calc.init(270.0, 270.0, 270.0, 270.0);
        assertEquals("1111101000", calc.getResult().getBinary()); 
        assertEquals(6, calc.getResult().getOneCount());
    }

    /**
     * Перевіряє серіалізацію та коректність відновлення даних.
     */
    @Test
    public void testRestore() {
        Calc calc = new Calc();
        double n1, n2, n3, n4;
        int y, oneCount;
        String binary;

        for (int ctr = 0; ctr < 1000; ctr++) {
            n1 = Math.random() * 360;
            n2 = Math.random() * 360;
            n3 = Math.random() * 360;
            n4 = Math.random() * 360;
            
            calc.init(n1, n2, n3, n4);
            y = calc.getResult().getY();
            binary = calc.getResult().getBinary();
            oneCount = calc.getResult().getOneCount();

            try {
                calc.save();
            } catch (IOException e) {
                throw new RuntimeException("Ошибка сериализации: " + e.getMessage());
            }

            // Змінюємо значення, щоб перевірити відновлення
            calc.init(0, 0, 0, 0);

            try {
                calc.restore();
            } catch (Exception e) {
                throw new RuntimeException("Ошибка десериализации: " + e.getMessage());
            }

            assertEquals(y, calc.getResult().getY());
            assertEquals(binary, calc.getResult().getBinary());
            assertEquals(oneCount, calc.getResult().getOneCount());
        }
    }
}
