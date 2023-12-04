package universe;

public class UniverseApp {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("***********************************");
        System.out.println("THE UNIVERSE APP");
        System.out.println("***********************************");

        Planet myFirstPlanet = new Planet("My first planet", false, 500.1, 500, 652);
        Planet mySecondPlanet = new Planet("My Second Planet", true, 6534.5, 4, 4532);
        Planet myThirdPlanet = new Planet("My Third Planet", false, 52753.4, 463, 5435);

        myThirdPlanet.explode();

        mySecondPlanet.makeBigger(50);

        myFirstPlanet.setName("First Planet");
    }
}
