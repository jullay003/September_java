package DAY2;

public class Interfaces {

    interface Refundable {
        void refund();
        default void audit() {
            System.out.println("Refund capability verified");
        }
        static boolean isValidAmount(double amount) {
            return amount > 0;
        }
    }

    interface Trackable {
        void track();
    }

    static class CardPayment implements Refundable, Trackable {
        private final String transactionId;

        CardPayment(String transactionId) {
            this.transactionId = transactionId;
        }

        @Override
        public void refund() {
            System.out.println("Refunding: " + transactionId);
        }

        @Override
        public void track() {
            System.out.println("Tracking: " + transactionId);
        }
    }

    public static void main(String[] args) {
        CardPayment payment = new CardPayment("TX200");
        payment.refund();
        payment.track();
        payment.audit();

        System.out.println(Refundable.isValidAmount(500));
    }
}
