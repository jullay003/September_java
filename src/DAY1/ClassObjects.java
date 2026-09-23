package DAY1;

public class ClassObjects {
    private String name;
    private int age;

    public ClassObjects(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public ClassObjects(){

    }

    public int getAge(){ return age;}
    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be -ve");
        }
        this.age = age;
    }



    public static void main(String[] args) {
        ClassObjects firstUser = new ClassObjects();
        firstUser.name = "Luke";
        firstUser.age = 25;

        ClassObjects secondUser = new ClassObjects();
        secondUser.name = "Shivani";
        secondUser.age = 25;

        System.out.println(firstUser.name);
        System.out.println(firstUser.age);

        System.out.println(secondUser.name);
        System.out.println(secondUser.age);

        ClassObjects user = new ClassObjects("Luke", 25);
        System.out.println(user.name);
        System.out.println(user.getAge());
        user.setAge(30);
        System.out.println(user.getAge());


    }
}
