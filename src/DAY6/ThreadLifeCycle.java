package DAY6;

public class ThreadLifeCycle {

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            System.out.println("Worker started");
        });
        System.out.println(worker.getState());
        worker.start();
        System.out.println(worker.getState());
        worker.join();
        System.out.println(worker.getState());

    }
}
