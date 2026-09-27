package DAY6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronization {

    static class BankAccount {
        private int balance = 1_000;
       synchronized void withdraw(int amount) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName()
                                + " withdrew "
                                + amount);
            }
       }

       private final Lock lock = new ReentrantLock();
       void withdraw1(int amount) {
           lock.lock();
           try {
               balance -= amount;
           } finally {
               lock.unlock();
           }
       }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) throws InterruptedException{

        BankAccount account = new BankAccount();
        Thread first = new Thread(() ->
                account.withdraw(600), "Thread-1");

        Thread second = new Thread(() ->
                account.withdraw(600),
                "Thread-2");

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Final balance: " + account.getBalance());

    }
}
