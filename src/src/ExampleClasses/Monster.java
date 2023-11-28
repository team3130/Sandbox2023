package ExampleClasses;

public class Monster {
    // INSTANCE VARIABLES
    public int size;
    public double weight;
    public String species;
    public boolean isDangerous = true;
    public String name;

    // CONSTRUCTOR
    public Monster(String name, String species, int size, double weight) {
        this.name = name;
        this.species = species;
        this.size = size;
        this.weight = weight;
    }

    // METHODS
    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void printColor(String color) {
        System.out.println(color);
    }

    public void addWeight(double addedWeight) {
        double newWeight = weight + addedWeight;
        System.out.println(newWeight);
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public static void main(String[] args) {
        Monster vampy = new Monster("Dracula", "European vampire", 7, 300.0);
        Monster amalgamation = new Monster("Frankenstein's Monster", "Frankenstein", 12, 527.9);
        Monster blob  = new Monster("blubby", "alien", 2, 8.5);
        Monster lorax = new Monster("Lorax", "truffulae", 4, 45);
        Monster split = new Monster("Jekyll", "scientistae", 6, 340.0);
        Monster vampy2 = new Monster("Mina", "Lady vampire", 6, 220.0);
        Monster cowboy = new Monster("Quincy", "Texan", 7, 320.0);
    }
}


