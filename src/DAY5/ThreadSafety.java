package DAY5;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafety {

    static class Counter {
        private int count;
        synchronized void increment() {
            count++;
        }
        int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException{

        AtomicInteger counter = new AtomicInteger();
        Thread first = new Thread(() ->
        {
            for(int i = 0; i < 10_000; i++) {
                counter.incrementAndGet();;
            }
        });

        Thread second = new Thread(() -> {
            for(int i = 0; i < 10_000; i++) {
                counter.incrementAndGet();
            }
        });

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(counter.get());
    }
}
