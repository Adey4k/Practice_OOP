package task3;

import java.io.IOException;

/**
 * Інтерфейс для візуалізації даних.
 */
interface View {
    void viewShow();
    void viewInit();
    void viewSave() throws IOException;
    void viewRestore() throws Exception;
}
