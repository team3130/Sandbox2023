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
    public void setTeamNumber(int newTeamNumber){
        this.teamNumber = newTeamNumber;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }
    public void setNumOfMembers(int newNumOfMembers){
        this.numOfMembers = newNumOfMembers;
    }

    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;
    }
    public void setIsQualifiedToWorlds(boolean newIsQualifiedToWorlds){
        this.qualifiedToWorlds = newIsQualifiedToWorlds;
    }
    public String getTeamName(){return teamName;}
    public void setTeamName(String newTeamName){
        this.teamName = newTeamName;
    }

    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32);
        System.out.println(ERROR3130.getNumOfMembers());



    }
}
