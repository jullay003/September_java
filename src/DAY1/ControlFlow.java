package DAY1;

public class ControlFlow {
    public static void main(String[] args) {
        final int age = 22;

        if(age >= 18) {   //produces a boolean
            System.out.println("User is an adult");
        }
        else {
            System.out.println("User is a minor");
        }
        //Multiple conditions:
        final int score = 75;
        if(score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        //eg:
        final int scorei = 90;
        if(scorei > 90) {
            System.out.println("Excellent");
        } else if(scorei >= 90) {
            System.out.println("Good");
        } else {
            System.out.println("Needs improvement");
        }

        //Switch
        final String role = "ADMIN";;
        final String accessLevel = switch (role) {
            case "ADMIN" -> "Full access";
            case "USER" -> "Limited access";
            default -> "Unknown role";
        };

        System.out.println(accessLevel);

        switch (role) {
            case "ADMIN":
                System.out.println("Full access");
                break;
            case "USER":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("Unknown role");
        }

        //Loops:
        for(int n = 1; n <= 5; n++) {
            System.out.println(n);
        }
        final int[] scores = {85, 92, 78};
        for(final int score1 : scores) {
            System.out.println(score1);
        }

        int attempts = 1;
        while(attempts <= 3) {
            System.out.println("Attempt: " + attempts);
            attempts++;
        }

        int attempts1 = 5;
        do{
            System.out.println("Attempts: " + attempts1);
            attempts1++;
        } while(attempts1 <= 3);  //condition failed, still it will run the body once

        //break:
        for(int num = 1; num <= 5; num++) {
            if(num == 3){
                break;
            }
            System.out.println(num);
        }

        for(int num = 1; num <= 5; num++) {
            if(num == 3) {
                continue;
            }
            System.out.println(num);
        }
    }
}
