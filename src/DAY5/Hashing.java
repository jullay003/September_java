package DAY5;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    record UserId(int value){

    }

    public static void main(String[] args) {
        Map<UserId, String> users = new HashMap<>();
        users.put(new UserId(101), "Luke");
        String user = users.get(new UserId(101));
        System.out.println(user);
    }


}
