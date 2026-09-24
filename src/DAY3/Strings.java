package DAY3;

public class Strings {

    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";

        String third = new String("Java");

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(first.equals(third));

        String name = "Luke";
        name.concat(" Skywalker");
        System.out.println(name);

        name = name.concat(" Skywalker");
        System.out.println(name);

    }


}
