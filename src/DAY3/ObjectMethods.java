package DAY3;

public class ObjectMethods {
    static class User {
        private final int id;
        private final String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object object){
            if(this == object) {
                return true;
            }

            if(!(object instanceof User other)) {
                return false;
            }

            return id == other.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }

        @Override
        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }


    }

    public static void main(String[] args) {
        User first = new User(101, "Luke");
        User second = new User(101, "FLora");

        System.out.println(first.equals(second));
        System.out.println(first.hashCode() == second.hashCode());
        System.out.println(first);
    }



}
