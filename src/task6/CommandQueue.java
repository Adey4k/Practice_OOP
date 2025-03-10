/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task6;

import java.util.concurrent.*;

/**
 *
 * @author Ladik
 */
class CommandQueue {
    private final BlockingQueue<Command> queue = new LinkedBlockingQueue<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public CommandQueue() {
        executor.submit(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Command command = queue.take();
                    command.execute();
                }
            } catch (InterruptedException ignored) {}
        });
    }

    public void put(Command command) {
        queue.add(command);
    }

    public void shutdown() {
        executor.shutdownNow();
    }
}