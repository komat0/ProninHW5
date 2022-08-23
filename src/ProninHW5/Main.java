package ProninHW5;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Baddy");
        Dog dog = new Dog("Polkan");
        Cat cat2 = new Cat("Blacky");

        cat.swim(10);
        cat.run(20);

        cat2.run(100);
        cat2.swim(5);


    }
}