package ExampleClasses;

public class FRCTeam {
    // INSTANCE VARIABLES
    int teamNumber;
    String teamName;
    int numOfMembers;
    boolean qualifiedToWorlds;
    double avgMatchScore;

    // CONSTRUCTOR
    public FRCTeam(int teamId, String name, int memberNum, int score, boolean worlds) {
        this.teamNumber = teamId;
        this.teamName = name;
        this.numOfMembers = memberNum;
        this.avgMatchScore = score;
        this.qualifiedToWorlds = worlds;

    }

    // METHODS
    public int getTeamNumber() {
        return teamNumber;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;
    }

    public double getAvgMatchScore(){return avgMatchScore;}

    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32, 87, true);
        System.out.println("the number of members is:" + ERROR3130.getNumOfMembers());
        System.out.println("the average match score is:" + ERROR3130.getAvgMatchScore());
        System.out.println("the team number is:" + ERROR3130.getTeamNumber());
        System.out.println("Is the team qualified for worlds:" + ERROR3130.isQualifiedToWorlds());
    }
}
