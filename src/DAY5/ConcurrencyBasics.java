package DAY5;
//A thread executes work independently

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyBasics {

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() ->
                System.out.println("Running on: " +
                        Thread.currentThread().getName()));
        worker.start(); //starts a new thread.
        worker.join();

        System.out.println("Main finished");


        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1"));
        executor.submit(() -> System.out.println("Task 2"));

        executor.shutdown();

        /**
         * Task
         * ExecutorService
         * Thread Pool
         * Worker threas
         */
    }

}
