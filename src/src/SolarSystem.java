public class SolarSystem {
    // Instance variables
    double density;
    String distanceToSun;
    int numOfMoons;
    int size;
    String name;

    // Constructor
    public SolarSystem(double density, String distanceToSun, int numOfMoons, int size, String nameOfPlanet){
        this.density = density;
        this.distanceToSun = distanceToSun;
        this.numOfMoons = numOfMoons;
        this.size = size;
        this.name = nameOfPlanet;
    }
    // Methods
    public double getMass(){return density;}
    public void setMass(double density) {
        this.density = density;
    }
    public String getDistanceToSun() {return distanceToSun;}
    public void setDistanceToSun(String distanceToSun) {
        this.distanceToSun = distanceToSun;
    }
    public int getNumOfMoons() {return numOfMoons;}
    public void setNumOfMoons(int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }
    public int getSize() {return size;}
    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    // Objects
    public static void main(String[] args) {
        SolarSystem earth = new SolarSystem(5515, "91.687 million miles", 1, 7926, "Earth");
        SolarSystem mars = new SolarSystem(3934, "142.33 million miles", 2, 4212, "Mars");
        SolarSystem mercury = new SolarSystem(13545.848, "36.768 million miles", 0, 3032,  "Mercury");

        System.out.println();
        System.out.println("------------");
        System.out.println("MERCURY INFO");
        System.out.println("------------");
        System.out.println();
        System.out.println("Name of planet: " + mercury.name);
        System.out.println("Density: " + mercury.density);
        System.out.println("Distance from the Sun: " + mercury.distanceToSun);
        System.out.println("Number of moons: " + mercury.numOfMoons);
        System.out.println("Size: " + mercury.size);

        System.out.println();
        System.out.println("----------");
        System.out.println("EARTH INFO");
        System.out.println("----------");
        System.out.println();
        System.out.println("Name of planet: " + earth.name);
        System.out.println("Density: " + earth.density);
        System.out.println("Distance from the Sun: " + earth.distanceToSun);
        System.out.println("Number of moons: " + earth.numOfMoons);
        System.out.println("Size: " + earth.numOfMoons);

        System.out.println();
        System.out.println("---------");
        System.out.println("MARS INFO");
        System.out.println("---------");
        System.out.println();
        System.out.println("Name of planet: " + mars.name);
        System.out.println("Density: " + mars.density);
        System.out.println("Distance from the Sun: " + mars.distanceToSun);
        System.out.println("Number of moons: " + mars.numOfMoons);
        System.out.println("Size: " + mars.size);
    }
}
