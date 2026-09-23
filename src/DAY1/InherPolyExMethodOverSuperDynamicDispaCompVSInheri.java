package DAY1;

public class InherPolyExMethodOverSuperDynamicDispaCompVSInheri {

    static class Animal {
        Animal(String name) {
            System.out.println("Animal: " + name);
        }
        void eat() {
            System.out.println("Animal is eating");
        }
        void makeSound() {
            System.out.println("Some animal sound");
        }
    }
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        void bark() {
            System.out.println("Dog is barking");
        }
        @Override
        void makeSound() {
            super.makeSound();
            System.out.println("Woof");
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
            System.out.println("CAT created");
        }

        @Override
        void makeSound() {
            super.makeSound();
            System.out.println("Meowww");
        }
    }

    static class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }
    static class Car {
        private Engine engine = new Engine();
        void startCar() {
            engine.start();
            System.out.println("Car started");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Luke");
        dog.eat();
        dog.bark();
        //method overriding
        dog.makeSound();
        //Dynamic Dispatch:
        Animal animal1 = new Cat("Flora");
        animal1.makeSound();

        //Composition: CAR HAS-A Engine , not CAR is a engine.
        Car car = new Car();
        car.startCar();
    }
}
