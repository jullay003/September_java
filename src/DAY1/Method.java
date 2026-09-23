package DAY1;

public class Method {

    public static void main(String[] args) {
        final int total = calculateTotal(100, 20);
        System.out.println("Total: " + total);
        System.out.println(add(10, 29));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));
        final int result = square(5);
        System.out.println(result);

        final Method method = new Method();
        final UserService userService = method.new UserService();
        final String greeting = userService.createGreeting("Shiva");
    }
    private static int calculateTotal(final int price, final int tax){
        return price + tax;
    }

    //Method overloading

    private static int add(final int first, final int second) {
        return first + second;
    }
    private static int add(final int first,
                           final int second,
                           final int third) {
        return first + second + third;
    }

    private static double add(
            final double first,
            final double second
    ) {
        return first + second;
    }
    //static:
    public static int square(final int number) {
        return number * number;
    }
    //Instance method:
    class UserService{
        String createGreeting(final String userName) {
            return "Hello, " + userName;
        }
    }
    //Scope: Where a variable can be accessed
    //Local scope

}

