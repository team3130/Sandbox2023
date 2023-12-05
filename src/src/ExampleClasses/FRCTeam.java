package ExampleClasses;

public class FRCTeam {
    // INSTANCE VARIABLES
    int teamNumber;
    String teamName;
    int numOfMembers;
    boolean qualifiedToWorlds;
    double avgMatchScore;

    // CONSTRUCTOR
    public FRCTeam(int teamId, String name, int memberNum) {
        this.teamNumber = teamId;
        this.teamName = name;
        this.numOfMembers = memberNum;
    }

    // METHODS
    public int getTeamNumber() {
        return teamNumber;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;}

    public String getTeamName() {
        return teamName;
    }
    public double getAvgMatchScore() {
        return avgMatchScore;
    }
    public void setTeamNumber(int teamnumber) {
        this.teamNumber = teamnumber;
    }
    public void setQualifiedToWorlds(boolean qualifiedToWorlds) {
        this.qualifiedToWorlds = qualifiedToWorlds;
    }
    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32);
        System.out.println(ERROR3130.getNumOfMembers());
    }
}
