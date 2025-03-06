package task4;

import org.junit.Test;
import static org.junit.Assert.*;
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
        assertEquals(0, calc.getResults().get(0).getY());

        calc.init(90.0, 90.0, 90.0, 90.0);
        assertEquals(1000, calc.getResults().get(1).getY());

        calc.init(180.0, 180.0, 180.0, 180.0);
        assertEquals(0, calc.getResults().get(2).getY());

        calc.init(270.0, 270.0, 270.0, 270.0);
        assertEquals(-1000, calc.getResults().get(3).getY());

        calc.init(360.0, 360.0, 360.0, 360.0);
        assertEquals(0, calc.getResults().get(4).getY());
    }

    
     /**
     * Перевіряє бінарне представлення та кількість одиниць.
     */
    @Test
    public void testBinaryAndOnes() {
        Calc calc = new Calc();

        calc.init(90.0, 90.0, 90.0, 90.0);
        assertEquals("1111101000", calc.getResults().get(0).getBinary());
        assertEquals(6, calc.getResults().get(0).getOneCount());

        calc.init(180.0, 180.0, 180.0, 180.0);
        assertEquals("0000000000", calc.getResults().get(1).getBinary());
        assertEquals(0, calc.getResults().get(1).getOneCount());
    }
    
    /**
     * Перевіряє серіалізацію та коректність відновлення даних.
     */
    @Test
    public void collectionTestRestore() {
        Calc calc = new Calc();

        calc.init(45.0, 135.0, 225.0, 315.0);
        int originalSize = calc.getResults().size();

        try {
            calc.save();
        } catch (IOException e) {
            fail("Serialization error: " + e.getMessage());
        }

        // Створюємо новий об'єкт Calc і відновлюємо дані
        Calc restoredCalc = new Calc();
        try {
            restoredCalc.restore();
        } catch (Exception e) {
            fail("Deserialization error: " + e.getMessage());
        }

        assertEquals(originalSize, restoredCalc.getResults().size());
        assertEquals(calc.getResults().get(0).getY(), restoredCalc.getResults().get(0).getY());
    }
}
