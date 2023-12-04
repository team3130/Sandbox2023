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
    public void setTeamNumber(int newteamnumber){
        this.teamNumber = newteamnumber;

    }

    public int getNumOfMembers() {
        return numOfMembers;
    }
    public void setNumOfMembers(int newnummember){
        this.numOfMembers = newnummember;
    }
    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;
    }
    public void setQualifiedToWorlds(boolean newqualifiedtoworlds){
        this.qualifiedToWorlds = newqualifiedtoworlds;
    }
    public double getAvgMatchScore(){ return avgMatchScore;}
    public void setAvgMatchScore(double newavgmatchscore){
        this.avgMatchScore = newavgmatchscore;
    }


    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32);
        System.out.println(ERROR3130.getNumOfMembers());
    }
}
