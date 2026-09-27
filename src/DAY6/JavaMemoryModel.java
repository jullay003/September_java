package DAY6;

public class JavaMemoryModel {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException{

        Thread worker = new Thread(() -> {
            while(running) {
                //doing work
            }
            System.out.println("WOkrer stopped");
        });

        worker.start();
        Thread.sleep(1000);
        running = false;
        worker.join();

    }





}
