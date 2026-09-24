package DAY3;

import java.util.function.Predicate;

public class Lambdas {

    @FunctionalInterface
    interface Calculator {
        int calculate(int first, int second);
    }

    public static void main(String[] args) {
        Calculator addition = (first, second) -> first + second;
        Calculator add = Integer::sum;
        Calculator multiply = (first, second) -> first * second;

        System.out.println(addition.calculate(10, 20));
        System.out.println(add.calculate(9890, 78989));
        System.out.println(multiply.calculate(23, 90));

        Predicate<Integer> isAdult = age -> age >= 18;
        System.out.println(isAdult.test(10));
    }

}
