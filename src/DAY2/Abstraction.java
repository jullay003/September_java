package DAY2;

public class Abstraction {

    abstract static class Payment {
        protected String transactionId;
        protected double amount;

        Payment(String transactionId, double amount) {
            this.transactionId = transactionId;
            this.amount = amount;
        }

        abstract void process();

        void printDetails() {
            System.out.println("Transaction: " + transactionId);
            System.out.println("Amount: " + amount);
        }
    }

    static class CardPayment extends Payment {
        CardPayment(String transactionId, double amount) {
            super(transactionId, amount);
        }

        @Override
        void process() {
            System.out.println("Processing card payment");
        }
    }

    public static void main(String[] args) {
        Payment payment = new CardPayment("TX100", 500);
        payment.printDetails();
        payment.process();
    }

}
