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

    public void getNutrients() {         // getter #1
    }

    public void getShock() {          // getter #2
    }

    public void setNutrients(int newNutrients) {     // setter #1
        this.nutrients = newNutrients;
    }

    public void setBlood(int newBloodCount) {         // setter #2
        this.blood = newBloodCount;
    }

    public void moreBlood(int addedBloodFlow) {        // random print method #1
        int newBlood = blood + addedBloodFlow;
        System.out.println(newBlood);
    }

    public void lessPower(double notNeeded) {          // random print method #2
        double ecoFriendly = nutrients - notNeeded;
        System.out.println(ecoFriendly);
    }

    public void shocky(double morePower) {              //random print method #3
        double newShock = shock + morePower;
        System.out.println(newShock);
    }

    public double newShock;

    public void newShocky(double changeShock) {            //if statement
        if (newShock <= (changeShock + shock)) {
            System.out.println("moreShock");
        } else {
            System.out.println("lessShock");
        }
    }

        public static void main (String[]args){
            Organs heart = new Organs(7, 9.4, 17, "Heart");
            Organs lungs = new Organs(5, 5.2, 11, "Lungs");
            Organs brain = new Organs(19, 25.3, 51, "Brain");
            System.out.println(heart.blood);
            System.out.println(brain.nutrients);
            System.out.println(lungs.shock);
            brain.shocky(-1);
            heart.lessPower(1.2);
            lungs.moreBlood(2);
            heart.newShocky(0);
            heart.setBlood(6);
            lungs.getNutrients();
            brain.getShock();
            lungs.setNutrients(3);
        }
    }



