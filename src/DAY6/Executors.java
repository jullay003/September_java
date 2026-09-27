package DAY6;

import java.util.concurrent.*;

public class Executors {

    public static void main(String[] args) throws InterruptedException{

        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
//
//        Callable<Integer> task = () -> {
//            Thread.sleep(500);
//            return 42;
//        };
//
//        Future<Integer> future = executor.submit(task);
//        System.out.println("Main continues...");
//        Integer result = future.get();
//        System.out.println("Result: " + result);
//        executor.shutdown();

        //BlockingQueue:
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() ->
        {
            try {
                queue.put("Order-100");
                queue.put("Order-101");
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() ->
        {
            try {
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();



    }
}
