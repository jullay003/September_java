package DAY4;

import java.util.Optional;

/**
 * Optional<T> -> a value OR no value
 * It is mainly useful for return values where absence is valid.
 *
 * Optional.of(value)
 * Optional.ofNullable(value)
 * Optional.empty()
 *
 * isPresent()
 * ifPresent()
 *
 * orElse()
 * orElseGet()
 * orElseThrow()
 *
 */

public class OptionalExample {
    static Optional<String> findUser(boolean userExists){
        if(userExists){
            return Optional.of("Luke");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        final Optional<String> user = findUser(true);
        user.ifPresent(name ->
                System.out.println("User: " + name));


        final String name = findUser(false).orElse("Unknown");
        System.out.println(name);

    }

//Primarily, use it where an API naturally communicated a possibly absent result.


}
