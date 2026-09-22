public class VariablesDT {
    public static void main(String[] args) {
        final int age = 25;
        final double salary = 850000.50;
        final boolean active = true;
        final char grade = 'A';
        final String name = "Alex";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + active);
        System.out.println("Grade: " + grade);

      //Type inference: Java can infer the type with var
        var userName = "Alex";
        var age1 = 25;
        var salary1 = 85000000.50;

        System.out.println(userName);
        System.out.println(age1);
        System.out.println(salary1);

      //Casting
      final int number1 = 10;
      final double decimalNumber = number1;
      final double price = 19.99;
      final int roundedDownPrice = (int) price;

        System.out.println(decimalNumber);
        System.out.println(roundedDownPrice);

      final int number = 10;
      final double result = (double) number/4; //without explicit case , it gives 2.0 due to int/int division and storing in double.
        System.out.println(result);



    }


}
