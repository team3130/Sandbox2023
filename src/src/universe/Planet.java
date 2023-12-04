package universe;

public class Planet {
    // Instance Variables
    private String name;
    private boolean isGas;
    private double circumference;
    private int moons;
    private int distance;
    // Constructor

    public Planet(String name, boolean isGas, double circumference, int moons, int distance) {
        this.name = name;
        this.isGas = isGas;
        this.circumference = circumference;
        this.moons = moons;
        this.distance = distance;
        System.out.println("Creating planet " + name);
    }

    // Methods
    public int getMoons() {
        return this.moons;
    }

    public void setMoon(int newMoon) {
        this.moons = newMoon;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int newDistance) {
        this.distance = newDistance;
    }

    public double getCircumference() {
        return this.circumference;
    }

    public void setCircumference(double newCircumference) {
        this.circumference = newCircumference;
    }

    public boolean getIsGas() {
        return this.isGas;
    }

    public void setIsGas(boolean newIsGas) {
        this.isGas = newIsGas;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        System.out.println("Changing planet name from " + this.name + " to " + newName);
        this.name = newName;
    }

    public void explode() {
        System.out.println("Planet " + this.name + " exploded!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public void makeBigger(int multiplier) {
        System.out.println("Changing the circumference of " + this.name + " from " + this.circumference + " to " + this.circumference * multiplier);
        this.circumference = this.circumference * 2;
    }
}
