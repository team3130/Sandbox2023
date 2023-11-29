package ExampleClasses;

public class Cat {
    // INSTANCE VARIABLES
    public String species;
    public String color;
    public static int population;

    // CONSTRUCTOR
    public Cat(String scientificName, String color, int population) {
        this.species = scientificName;
        this.color = color;
        this.population = population;
    }

    // POSSIBLE METHODS
    public int addPopulation(int num) {
        return this.population + num; // note this doesn't actually modify the population, only returns the modified value
    }

    public String getSpecies() {
        System.out.println(this.species);
        return this.species;
    }

    // HOW TO CREATE OBJECTS
    public static void main(String[] args) {
        Cat lion = new Cat("Panthera leo", "Gold", 0);
        Cat tabby = new Cat("dumb cat", "Mixed", 0 );
        Cat cheetah = new Cat("Acinonyx jubatus", "Black and yellow", 0);
        System.out.println("oh no global warming!" );
        System.out.println(lion.species);
        System.out.println(tabby.species);
        System.out.println(population);

        lion.color = "shiny";
        System.out.println(lion.color);

    }
}
