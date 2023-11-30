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
    public String getTeamName(){return teamName;}
    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;
    }
    public void setTeamNumber(int tn) {
        teamNumber = tn;
    }

    public void setNumOfMembers(int nm) {
        numOfMembers = nm;
    }
    public void setTeamName(String tn){teamName = tn;}
    public void setQualifiedToWorlds(boolean qw) {
        qualifiedToWorlds = qw;
    }

    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32);
        System.out.println(ERROR3130.getNumOfMembers());
    }
}
