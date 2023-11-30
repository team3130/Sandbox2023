package ExampleClasses;

public class FRCTeam {
    // INSTANCE VARIABLES
    int teamNumber;
    String teamName;
    int numOfMembers;
    boolean qualifiedToWorlds;
    double avgMatchScore;

    // CONSTRUCTOR
    public FRCTeam(int teamId, String name, int memberNum, double avgMatchScore) {
        this.teamNumber = teamId;
        this.teamName = name;
        this.numOfMembers = memberNum;
        this.avgMatchScore = avgMatchScore;
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

    public String getTeamName() {
        return teamName;
    }

    public double getAvgMatchScore() {
        return avgMatchScore;
    }

    public void setTeamNumber(int newTeamNumber) {
        this.teamNumber = newTeamNumber;
    }

    public void setNumOfMembers(int newNumOfMembers) {
        this.numOfMembers = newNumOfMembers;
    }

    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32, 0.2);
        System.out.println(ERROR3130.getNumOfMembers());
        ERROR3130.setNumOfMembers(33);
        System.out.println(ERROR3130.getNumOfMembers());
    }
}
