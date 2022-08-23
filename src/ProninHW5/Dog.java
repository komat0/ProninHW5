package ProninHW5;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.maxDistanceRun = 500;
        this.maxDistanceSwim = 10;
    }

    @Override
    void run(int r) {
        if (r <= this.maxDistanceRun) {
            System.out.println("The dog " + name + " run " + r + " meters");
        } else {
            System.out.println("The dog " + name + " is tired and can't run");
        }
    }

    @Override
    void swim(int s) {
        if (s <= this.maxDistanceSwim) {
            System.out.println("The dog " + name + " swim " + s + " meters");
        } else {
            System.out.println("The dog " + name + " is tired and drowned");
        }
    }
}
