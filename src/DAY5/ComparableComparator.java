package DAY5;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ComparableComparator {

    static class User implements Comparable<User> {

        private final String name;
        private final int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(User other){
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString(){
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Shiva", 18));
        users.add(new User("Luke", 26));
        users.add(new User("Lukha", 3));

       users.sort(null);
        System.out.println(users);

    //    users.sort((first, second) -> first.name.compareTo(second.name));
     //   users.sort((x, y) -> x.name.compareTo(y.name));
     // users.sort(Comparator.comparing(user -> user.name));
        //comparable: default ordering belongs to the class
        //comparator: custom ordering provided from outside.





    }



}
