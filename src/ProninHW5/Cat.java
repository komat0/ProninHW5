package ProninHW5;

public class Cat extends Animal {
    int maxDistanceRun = 200;
    int maxDistanceSwim = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int r) {
        if (r <= this.maxDistanceRun) {
            System.out.println("The cat " + name + " run " + r + " meters");
        } else {
            System.out.println("The cat " + name + " is tired and can't run");
        }
    }

    @Override
    void swim(int s) {
        if (s <= this.maxDistanceSwim) {
            System.out.println("The cat " + name + " swim " + s + " meters");
        } else {
            System.out.println("The cat " + name + " can't swim");
        }
    }
}
