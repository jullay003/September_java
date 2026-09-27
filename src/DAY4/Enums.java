package DAY4;
//Use an enum when a value should come from a fixed set of constants.
//enum isn't merely a list of strings. It can contain behaviour

public class Enums {

    enum PaymentStatus {
        PENDING,
        COMPLETED,
        FAILED
    }
    enum PaymentStatus1{
        PENDING("Waiting"),
        COMPLETED("Successful"),
        FAILED("Unsuccessful");

        private final String description;
        PaymentStatus1(String description) {
            this.description = description;
        }
        String getDescription(){
            return description;
        }
    }

    public static void main(String[] args) {
        final PaymentStatus paymentStatus = PaymentStatus.COMPLETED;

        switch (paymentStatus) {
            case PENDING -> System.out.println("payment is pending");
            case COMPLETED -> System.out.println("payment succeeded");
            case FAILED -> System.out.println("payment failllll bchhao ");
        }

        System.out.println(PaymentStatus1.COMPLETED.getDescription());
    }

}
