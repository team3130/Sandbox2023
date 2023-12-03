public class TeamData {
    // (1) INSTANCE VARIABLES
    public int teamnum;
    public int maxscore;
    public int minscore;
    public int avgscore;
    public int defenceskill;

    // (2) CONSTRUCTOR
    public TeamData(int teamnum, int maxscore, int minscore, int avgscore, int defence) {
        this.teamnum = teamnum;
        this.maxscore = maxscore;
        this.minscore = minscore;
        this.avgscore = avgscore;
        this.defenceskill = defence;
    }


    // (3) METHODS
    public int getTeamnum(){return teamnum;}
    public int getMaxscore(){return maxscore;}
    public int getMinscore(){return minscore;}
    public int getAvgscore(){return avgscore;}
    public int getDefenceskill(){return defenceskill;}

    public void setTeamnum(int newTeamnum){this.teamnum = newTeamnum;}
    public void setMaxscore(int newMaxscore){this.maxscore = newMaxscore;}
    public void setMinscore(int newMinscore){this.minscore = newMinscore;}
    public void setAvgscore(int newAvgscore){this.avgscore = newAvgscore;}
    public void setDefenceskill(int newDefenceskill){this.defenceskill = newDefenceskill;}

    // EXAMPLES OF HOW TO CREATE OBJECTS AND USE THEM
    public static void main(String[] args) {
        TeamData team3130 = new TeamData(3130, 135, 50, 87, 3);
        TeamData team2175 = new TeamData(2175, 120, 60, 87, 1);
        TeamData team1234 = new TeamData(1234, 110, 60, 85, 1);
        TeamData team111 = new TeamData(111, 145, 80, 120, 2);
        TeamData team112 = new TeamData(112, 145, 75, 110, 2);
        TeamData team3883 = new TeamData(3883, 125, 55, 85, 4);
        TeamData team3206 = new TeamData(3206, 145, 70, 95, 3);
        TeamData team2883 = new TeamData(2883, 155, 85, 110, 4);
        TeamData team9761 = new TeamData(9761, 100, 40, 65, 1);
        TeamData team9991 = new TeamData(9991, 95, 45, 65, 2);
        TeamData team9992 = new TeamData(9992, 95, 50, 70, 3);
    }
}
