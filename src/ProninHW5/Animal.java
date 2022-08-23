package ProninHW5;

public abstract class Animal {
    String name;
    int maxDistanceRun;
    int maxDistanceSwim;

    public Animal(String name, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void run(int r);
    abstract void swim(int s);
}
