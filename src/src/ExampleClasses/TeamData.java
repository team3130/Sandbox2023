package ExampleClasses;

public class TeamData {
    // (1) INSTANCE VARIABLES
    public int teamnum;
    public int maxscore;
    public int minscore;
    public int avgscore;
    public boolean playeddefence = false;

    // (2) CONSTRUCTOR
    public void TeamData(int teamnum, int maxscore, int minscore, int avgscore, boolean playeddefense) {
        this.teamnum = teamnum;
        this.maxscore = maxscore;
        this.minscore = minscore;
        this.avgscore = avgscore;
        this.playeddefence = playeddefense;
    }


    // (3) METHODS
    public int getTeamnum(){return teamnum;}
    public int getMaxscore(){return maxscore;}
    public int getMinscore(){return minscore;}
    public int getAvgscore(){return avgscore;}
    public double getPlayeddefence(){return playeddefence;}

    public void setTeamnum(int newTeamnum){return teamnum;}
    public void setMaxscore(int newMaxscore){return maxscore;}
    public void setMinscore(int newMinscore){return minscore;}
    public void setAvgscore(int newAvgscore){return avgscore;}
    public void setPlayeddefence(boolean newPlayeddefence){return playeddefence;}

    // EXAMPLES OF HOW TO CREATE OBJECTS AND USE THEM
    public static void main(String[] args) {
        TeamData 3130 = new TeamData(3130, 135, 50, 87, false);
        TeamData 2175 = new TeamData(2175, 120, 60, 87, false);
    }
}
