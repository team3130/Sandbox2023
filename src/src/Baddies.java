public class Baddies {
    //instance variables
    public String weakness;
    public String name;
    public String mythology;
    public int numOfMembers;
    public int numOfLimbs;
    public int powerLvl;
    public double heightInFeet;
    public boolean dead;

    public Baddies(String name, String mythology, String weakness,
                   int numOfLimbs, int numOfMembers, int powerLvl,
                   double heightInFeet, boolean dead) {
        this.name = name;
        this.mythology = mythology;
        this.weakness = weakness;
        this.numOfLimbs = numOfLimbs;
        this.numOfMembers = numOfMembers;
        this.powerLvl = powerLvl;
        this.heightInFeet = heightInFeet;
        this.dead = dead;
    }

    public boolean getDidBroDie(){
        return dead;
    }
    public String getMythology(){
        return mythology;
    }
    public void iKilledEm(){
        dead = true;
        System.out.println("The wicked witch is dead!!");
    }
    public void broLived(){
        dead = false;
    }
    public void setWeakness(String newWeakness){
        weakness = newWeakness;
    }
    public void setPowerLvl(int newPowerLvl){
        powerLvl = newPowerLvl;
    }
    public int grewLimbs(int change) {
        numOfLimbs += change;
        System.out.println(numOfLimbs);
        return numOfLimbs;
    }


    public static void main(String[] args) {
        Baddies dragon = new Baddies("dragon", "all", "none",
                6, 4, 50,
                56, false);
        Baddies hydra = new Baddies("hydra", "greek", "fire",
                7, 1, 56,
                65, true);
        Baddies rumplestiltskin = new Baddies("rumplestiltskin", "german", "name",
                4, 1, 2,
                4, true);
        Baddies apep = new Baddies("apep", "egyptian", "order",
                0, 1, 99,
                999, false);

        hydra.broLived();
        hydra.grewLimbs(3);
        apep.iKilledEm();
    }

}
