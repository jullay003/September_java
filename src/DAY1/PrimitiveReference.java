package DAY1;

public class PrimitiveReference {

    private static final class User {
        private String name;
        private User(final String name) {
            this.name = name;
        }
        private String getName() {
            return name;
        }
        private void setName(final String name) {
            this.name = name;
        }
        @Override
        public boolean equals(final Object object) {
            if(this == object) { //same object thn immediately true
                return true;
            }
            if(!(object instanceof User other)) { //Is other obj actually a User?
                return false;
            }
            return name.equals(other.name); //for 2 Users, compare their name.
        }
        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    public static int changeNumber(int number) {
        number = 50;
        return number;
    }
    public static void changeName(final User user) {
        user.setName("Flora");
    }

    public static void main(String[] args) {
        int age = 25;
        int anotherAge = age;
        anotherAge = 30;

        System.out.println(age);
        System.out.println(anotherAge); //gets a copy of the value;

        //Reference Type:
        final User firstUser = new User("Luke");
        final User secondUser = firstUser;

        secondUser.setName("Flora");
        System.out.println(firstUser.getName());
        System.out.println(secondUser.getName());

        // ==
        final int num1 = 100;
        final int num2 = 100;

        System.out.println(num1 == num2);

        final User user1 = new User("Luke");
        final User user2 = new User("Luke");
        System.out.println(user1 == user2);

        //equals and hashcode()
        final User useri = new User("Luke");
        final User usery = new User("Luke");
        System.out.println(useri == usery);
        System.out.println(useri.equals(usery));

        User userii = null;
       // User userxx = userii;
        System.out.println(userii);
       // System.out.println(userii.equals(userxx));

        //pass by value:
        int value = 10;
        changeNumber(value);
        System.out.println(value);
        System.out.println(changeNumber(value));

        //now for reference type:
        final User userq = new User("Luke");
        changeName(userq);
        System.out.println(userq.getName());
// you cannot change the caller's reference, but u can change the object that the copied reference points to.
    //wrapper classes:
        final int primitive = 10;
        final Integer wrapper = 10;

        System.out.println(primitive);
        System.out.println(wrapper);
        System.out.println(primitive == wrapper);


    }



}
