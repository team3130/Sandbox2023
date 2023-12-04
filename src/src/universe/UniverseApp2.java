package universe;

import java.util.Scanner;

public class UniverseApp2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("***********************************");
        System.out.println("THE UNIVERSE APP");
        System.out.println("***********************************");

        System.out.println();
        System.out.println("Create your first planet....");

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Is this a gas planet? (true or false): ");
        boolean isGas = scanner.nextBoolean();

        System.out.println();
        System.out.println("What is the circumference of this planet?: ");
        double circumference = scanner.nextDouble();

        System.out.println();
        System.out.println("How many moons does it have?: ");
        int moons = scanner.nextInt();

        System.out.println();
        System.out.println("What is the distance of it away from the sun?: ");
        int distance = scanner.nextInt();
        System.out.println();

        Planet planet = new Planet(name, isGas, circumference, moons, distance);

        System.out.println();
        System.out.println("What do you want to do with your planet?");
        System.out.println("1) double the size of the planet");
        System.out.println("2) explode the planet");

        int action = scanner.nextInt();
        if (action == 1) {
            planet.makeBigger(2);
        }
        if (action == 2) {
            planet.explode();
        }








    }
}
