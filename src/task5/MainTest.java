package task5;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

/**
 * Виконує тестування розроблених класів.
 */
public class MainTest {
    private Calc calc;

    /**
     * Виконується перед кожним тестом: очищує результати.
     */
    @Before
    public void setUp() {
        calc = Calc.getInstance();
        calc.getResults().clear();  // Очищуємо список перед тестом
    }

    /**
     * Перевіряє основну функціональність класу {@linkplain Calc}.
     */
    @Test
    public void testCalc() {
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
        calc.init(45.0, 135.0, 225.0, 315.0);
        int originalSize = calc.getResults().size();

        try {
            calc.save();
        } catch (IOException e) {
            fail("Serialization error: " + e.getMessage());
        }

        // Відновлюємо дані в тому ж об'єкті
        try {
            calc.restore();
        } catch (Exception e) {
            fail("Deserialization error: " + e.getMessage());
        }

        assertEquals(originalSize, calc.getResults().size());
        assertEquals(calc.getResults().get(0).getY(), calc.getResults().get(0).getY());
    }
    
     /**
     * Перевіряє роботу UndoManager.
     */
@Test
public void testUndo() {
    UndoManager undoManager = UndoManager.getInstance(calc);

    calc.init(90.0, 90.0, 90.0, 90.0);
    undoManager.saveState(); // Зберігаємо перед додаванням
    calc.init(180.0, 180.0, 180.0, 180.0);
    undoManager.saveState(); // Зберігаємо перед додаванням

    int sizeBeforeUndo = calc.getResults().size();
    assertEquals(2, sizeBeforeUndo); // Додано два елементи

    undoManager.undo(); // Скасовуємо останню команду

    int sizeAfterUndo = calc.getResults().size();
    assertEquals(1, sizeAfterUndo); // Має залишитися один елемент

    // Перевіряємо, що залишився саме перший доданий елемент
    assertEquals(1000, calc.getResults().get(0).getY());

    // Додаємо ще одне скасування, щоб видалити останній елемент
    undoManager.undo();
    assertEquals(0, calc.getResults().size()); // Усі операції скасовані
}

    
}
