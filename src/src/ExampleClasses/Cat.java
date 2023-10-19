package ExampleClasses;

public class Cat {
    public String species;
    public String color;
    public int population;

    public Cat(String scientificName, String color, int population) {
        this.species = scientificName;
        this.color = color;
        this.population = population;
    }

    public static void main(String[] args) {
        Cat lion = new Cat("Panthera leo", "Gold", 23000);
        Cat tabby = new Cat("Felis Catus", "Mixed", 3000000);
        Cat cheetah = new Cat("Acinonyx jubatus", "Black and yellow", 7000);
    }
}
