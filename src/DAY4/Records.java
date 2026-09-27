package DAY4;

public class Records {

    record User(long id, String name, String email) {

    }

    public static void main(String[] args) {
        final User user = new User(101, "Luke", "luke@example.com");

        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user.email());
        System.out.println(user);
    }
}

/**
 * Records are useful for simple immutable data carriers.
 * without a record, I will normally:
 * fields
 * constructor
 * getters
 * equals()
 * hashCode()
 * toString()
 * Record gives you these automatically.
 *
 *
 * Record components are final.
 * They are ideal for data-carrying objects, especially DTO style use cases.
 */

