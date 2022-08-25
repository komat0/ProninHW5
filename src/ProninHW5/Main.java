package ProninHW5;
/**
 * 1. Create classes Dog and Cat with inheritance from the Animal class.
 * 2. All animals can run and swim. The length of the obstacle is passed as a parameter to each method. The result
 * of the action will be printing to the console.
 * 3. Each animal has restrictions on actions (running: cat 200 m, dog 500 m; swimming: cat cannot swim, dog 10 m).
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Baddy");
        Dog dog = new Dog("Polkan");
        Cat cat2 = new Cat("Blacky");
        Dog dog2 = new Dog("Volkodav");


        cat.run(201);
        cat.swim(5);

        cat.run(200);
        cat2.swim(0);

        dog.run(400);
        dog.swim(50);

        dog2.run(500);
        dog2.swim(10);

        cat.printCounterObj();
        dog.printCounterObj();

        System.out.println(cat2.getCatCounter());
        System.out.println(dog.getDogCounter());
        System.out.println(Animal.animalCount);
    }
}