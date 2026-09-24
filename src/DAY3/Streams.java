package DAY3;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> scores = List.of(
                45, 82, 91, 67, 95, 30
        );

        List<Integer> passingScores = scores.stream()
                .filter(score -> score >= 60)
                .toList();

        System.out.println(passingScores);

        List<String> names = List.of(
                "Luke",
                "Shivani",
                "Hehe"
        );

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upperCaseNames);


        List<String> names1 = List.of("Luke",
                "Alexander",
                "Flora",
                "Christopher");
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .toList();
        System.out.println(longNames);

        List<Integer> prices = List.of(100, 200, 300);
        int total = prices.stream()
                .reduce(0, Integer::sum);
        System.out.println(total);



    }
}
