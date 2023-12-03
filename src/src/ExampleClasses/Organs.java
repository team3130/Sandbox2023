package ExampleClasses;

public class Organs {

    public int nutrients;                       // inst. vars #1-4
    public String organType;
    public double shock;
    public int blood;

    public Organs(int bloodSupplied, double electricityNeeded, int nutrientsNeeded, String whatOrganIsIt) {      //  object constructor
        this.blood = bloodSupplied;
        this.shock = electricityNeeded;
        this.nutrients = nutrientsNeeded;
        this.organType = whatOrganIsIt;
    }


    public int getNutrients() {         // getter #1
        return nutrients;
    }

    public double getShock() {          // getter #2
        return shock;
    }

    public int setNutrients(int newNutrients) {     // setter #1
        this.nutrients = newNutrients;
        return newNutrients;
    }

    public int setBlood(int newBloodCount) {         // setter #2
        this.blood = newBloodCount;
        return newBloodCount;
    }

    public void moreBlood(int addedBloodFlow) {        // random print method #1
        int newBlood = blood + addedBloodFlow;
        System.out.println(newBlood);
    }

    public void lessPower(double notNeeded) {          // random print method #2
        double ecoFriendly = nutrients - notNeeded;
        System.out.println(ecoFriendly);
    }


    public static void main(String[] args) {
        Organs heart = new Organs( 7, 9.4, 17, "Heart" );
        Organs lungs = new Organs( 5, 5.2, 11, "Lungs" );
        Organs brain = new Organs( 19, 25.3, 51, "Brain" );
        System.out.println(heart.blood);
        System.out.println(brain.nutrients);
        System.out.println(lungs.shock);
        heart.lessPower(1.2);
        lungs.moreBlood(2);
    }
}
