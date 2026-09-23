package DAY2;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //List:
        List<String> transactions = new ArrayList<>();
        transactions.add("TX200");
        transactions.add("TX100");
        transactions.add("TX300");

        System.out.println("List: " + transactions);

        //SET
        Set<String> uniqueTransactions = new HashSet<>();
        uniqueTransactions.add("TX100");
        uniqueTransactions.add("TX100");
        uniqueTransactions.add("TX200");

        System.out.println("Set: " + uniqueTransactions);

        //MAP
        Map<String, Double> paymentAmounts = new HashMap<>();
        paymentAmounts.put("TX100", 500.00);
        paymentAmounts.put("TX200", 900.00);
        System.out.println("TX100 amount: " + paymentAmounts.get("TX100"));

    }


}
