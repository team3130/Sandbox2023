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

    public void setTeamNumber(int newTeamNum)  {
        this.teamNumber = newTeamNum;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int newMembers)    {
        this.numOfMembers = newMembers;
    }

    public boolean getQualifiedToWorlds() {   return qualifiedToWorlds;   }

    public void setIsQualifiedToWorlds(boolean weMadeIt)    {
        this.qualifiedToWorlds = weMadeIt;
    }


    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 32);
        System.out.println(ERROR3130.getNumOfMembers());
    }
}
