package ProninHW5;

public class Dog extends Animal {

    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    void run(int r) {
        int maxDistanceRun = 500;
        if (r > 0 && r <= maxDistanceRun) {
            System.out.println("The dog " + name + " run " + r + " meters");
        } else {
            System.out.println("The dog " + name + " is tired and can't run");
        }
    }

    @Override
    void swim(int s) {
        int maxDistanceSwim = 10;
        if (s > 0 && s <= maxDistanceSwim) {
            System.out.println("The dog " + name + " swim " + s + " meters");
        } else {
            System.out.println("The dog " + name + " is tired and drowned");
        }
    }

    @Override
    void printCounterObj() {
        System.out.println("Count of the created objects Dog: " + dogCount);
    }

    public int getDogCounter() {
        return dogCount;
    }
}
