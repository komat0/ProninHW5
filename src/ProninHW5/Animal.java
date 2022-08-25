package ProninHW5;

public abstract class Animal {

    String name;
    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    abstract void run(int r);
    abstract void swim(int s);
    abstract void printCounterObj();
}
