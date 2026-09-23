package DAY2;

public class Exceptions {

    static class PaymentException extends Exception {
        PaymentException(String message) {
            super(message);
        }
    }

    static void validateAmount(double amount) throws PaymentException {
        if(amount <= 0) {
            throw new PaymentException("Payment amount must be greater than zero");
        }
    }

    public static void main(String[] args) {
        try {
            validateAmount(-500);
            System.out.println("Payment is valid");
        } catch (PaymentException exception) {
            System.out.println("Payment failed: " + exception.getMessage());
        }finally {
            System.out.println("Validation completed");
        }
    }
}
