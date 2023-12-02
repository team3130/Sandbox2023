package ExampleClasses;

public class TeamData {
    // (1) INSTANCE VARIABLES
    public int teamnum;
    public int maxscore;
    public int minscore;
    public int avgscore;
    public boolean playeddefence = false;

    // (2) CONSTRUCTOR
    public void TeamData(int teamnum, int maxscore, int minscore, int avgscore) {
        this.teamnum = teamnum;
        this.maxscore = maxscore;
        this.minscore = minscore;
        this.avgscore = avgscore;
    }


    // (3) METHODS
    public int getTeamnum(){return teamnum;}
    public int getMaxscore(){return maxscore;}
    public int getMinscore(){return minscore;}
    public int getAvgscore(){return avgscore;}
    public boolean getPlayeddefence(){return playeddefence;}

    public void setTeamnum(int newTeamnum){this.teamnum = newTeamnum;}
    public void setMaxscore(int newMaxscore){this.maxscore = newMaxscore;}
    public void setMinscore(int newMinscore){this.minscore = newMinscore;}
    public void setAvgscore(int newAvgscore){this.avgscore = newAvgscore;}
    public void setPlayeddefence(boolean newPlayeddefence){this.playeddefence = newPlayeddefence;}

    // EXAMPLES OF HOW TO CREATE OBJECTS AND USE THEM
    public static void main(String[] args) {
        TeamData team3130 = new TeamData(3130, 135, 50, 87, false);
        //TeamData team2175 = new TeamData(2175, 120, 60, 87, false);
    }
}
