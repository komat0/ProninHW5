package ProninHW5;

public class Cat extends Animal {

    static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    void run(int r) {
        int maxDistanceRun = 200;
        if (r > 0 && r <= maxDistanceRun) {
            System.out.println("The cat " + name + " run " + r + " meters");
        } else {
            System.out.println("The cat " + name + " is tired and can't run");
        }
    }

    @Override
    void swim(int s) {
        System.out.println("The cat " + name + " can't swim");
    }

    @Override
    void printCounterObj() {
        System.out.println("Count of the created objects Cat: " + catCount);
    }

    public int getCatCounter() {
        return catCount;
    }
}
