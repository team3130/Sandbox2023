package ExampleClasses;

public class Cat {
    // INSTANCE VARIABLES
    public String species;
    public String color;
    public int population;
    public static int number;

    // CONSTRUCTOR
    public Cat(String scientificName, String color, int population) {
        this.species = scientificName;
        this.color = color;
        this.population = population;
        number++;
    }

    // POSSIBLE METHODS
    public int addPopulation(int num) {
        return this.population + num; // note this doesn't actually modify the population, only returns the modified value
    }

    public String getSpecies() {
        System.out.println(this.species);
        return this.species;
    }
    public static void isExtinct(Cat cat){
        if ((cat.population == 0)) {
            System.out.println(cat.species + " is extinct");
        } else {
            System.out.println(cat.species + " lives on");
        }
    }

    // HOW TO CREATE OBJECTS
    public static void main(String[] args) {
        Cat lion = new Cat("Panthera leo", "Gold", 0);
        Cat tabby = new Cat("Felis catus", "Mixed", 0);
        Cat cheetah = new Cat("Acinonyx jubatus", "Black and yellow", 0);
        System.out.println();
        System.out.println(number);
    }
}
