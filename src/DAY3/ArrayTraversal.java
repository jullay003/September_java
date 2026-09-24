package DAY3;

import java.util.List;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96};
        for (int score : scores) {
            System.out.println(score);
        }
        System.out.println();
        List<String> users = List.of(
                "Luke",
                "Flora",
                "Shiva"
        );
        for (String user : users){
            System.out.println("User: " + user);
        }


    }

}
