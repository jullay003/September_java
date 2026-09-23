package DAY2;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    static class Repository<T> {
        private final List<T> items = new ArrayList<>();

        void save(T item) {
            items.add(item);
        }

        List<T> findAll() {
            return List.copyOf(items);
        }
    }

//    static double calculateTotal(List<? super Abstraction.Payment> payments) {
//        double total = 0;
//        for(Abstraction.Payment payment : payments){
//            total += payment.getAmount;
//        }
//        return total;
//    }

    public static void main(String[] args) {
        Repository<String> stringRepository = new Repository<>();
        stringRepository.save("TX100");
        stringRepository.save("TX200");

        List<String> transactions = stringRepository.findAll();
        System.out.println(transactions);

    }
}
