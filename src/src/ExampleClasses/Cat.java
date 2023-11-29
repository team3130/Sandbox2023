package ExampleClasses;

public class Cat {
    // INSTANCE VARIABLES
    public String species;
    public String color;
    public int population;

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
        Cat lion = new Cat("Lion", "Gold", 23000);
        Cat tabby = new Cat("Felis catus", "Mixed", 3000000);
        Cat cheetah = new Cat("Cheetah", "Black and yellow", 7000);
        System.out.println(lion.species);
        System.out.println(tabby.species);
        System.out.println(cheetah.species);
        lion.species = "Gucci";
        tabby.species = "Lola";
        cheetah.species = "Tyreek Hill";
        System.out.println(lion.population);
        System.out.println(tabby.population);
        System.out.println(cheetah.population);
        lion.population = 0;
        tabby.population = 0;
        cheetah.population = 0;
    }
    }
