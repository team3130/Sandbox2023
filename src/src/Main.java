/*
IGNORE THIS CLASS
MAIN IS NEVER USED IN FRC
HOWEVER, IT IS IMPORTANT IN REAL LIFE CODE SO IF YOU WANNA KNOW LOOK INTO IT
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        (1) OPERATORS PRACTICE
         */
        System.out.println("(1) OPERATORS PRACTICE:");
        System.out.println(9057 + 90274903); // what is wrong with this line?
        // continue exercise here


        /*
        (2) VARIABLE TYPES AND DECLARATION EXAMPLES
         */
        System.out.println();
        System.out.println("(2) VARIABLE TYPES AND DECL:");
        int exampleInteger;
        exampleInteger = 1;
        int myInt = 300;

        double exampleDouble = 3.1415;
        boolean isTrue = true;
        String myString = "bruh";

        // create your own experimental variables here


        /*
        (3) VARIABLE REASSIGNMENT
         */
        System.out.println();
        System.out.println("(3) VARIABLE REASSIGNMENT");
        // verify this below by using print statements before and after reassignment
        int x = 2;
        x = x + 2; // x is now equal to 4

        int y = 2;
        y += y; // y is equal to 4

        // try variable reassignment yourself using shorthand: += *= /= -=


        /*
        (4) CONDITIONALS BASICS
         */
        System.out.println();
        System.out.println("(4) CONDITIONAL BASICS");

        int ERRORNumMembers = 51;
        int ERRORNumCaptains = 3;
        int numBigTeam = 20;
        int funnyNumber = 420;
        int unluckyNum = 13;
        int andInfAndBeyond = 999;
        int negativeNancy = -31;
        int boringNum = 0;

        boolean softwareIsTheBest = false;
        boolean juhaeSoftwareLead = true;
        boolean giorgiaPM = false;

        if (softwareIsTheBest) { // shorthand for if (softwareIsTheBest == true)
            System.out.println("Juhae is the best");
        } else {
            System.out.println("Business for life");
        }

        if (ERRORNumMembers <= numBigTeam) {
            System.out.println("The ERRORs is a big team");
        }

        if (!giorgiaPM) {
            System.out.println("Oh no! Who has the schedule?");
        } else {
            System.out.println("Don't worry, Giorgia has the schedule.");
        }

        if (13 != 13) {  // remember that != means equals, but == is equals...
            System.out.println(" ");
        }

        /*
        (5) ADVANCED CONDITIONALS
         */
        System.out.println("(5) ADVANCED CONDITIONALS");

        String juhae = "the best";
        String giorgia = "the worst";

        if (juhae.equals("the best") && giorgia.equals("the worst")) {
            System.out.println("Juhae is the best, Giorgia is the worst");
        } else {
            System.out.println("Either Juhae is not the best or Giorgia is not the worst");
        }

        // write your own conditionals using &&, ||, and elif statements


    }
}