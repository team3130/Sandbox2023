package TeamData;

public class TeamData {
    // (1) INSTANCE VARIABLES
    public int teamnum;
    public int maxscore;
    public int minscore;
    public double avgscore;
    public int defenceskill;
    public String comments;

    // (2) CONSTRUCTOR
    public TeamData(int teamnum, int maxscore, int minscore, double avgscore, int defence, String comments) {
        this.teamnum = teamnum;
        this.maxscore = maxscore;
        this.minscore = minscore;
        this.avgscore = avgscore;
        this.defenceskill = defence;
        this.comments = comments;
    }


    // (3) METHODS
    public int getTeamnum(){return teamnum;}
    public int getMaxscore(){return maxscore;}
    public int getMinscore(){return minscore;}
    public double getAvgscore(){return avgscore;}
    public int getDefenceskill(){return defenceskill;}
    public String getComments(){return comments;}

    public void setTeamnum(int newTeamnum){this.teamnum = newTeamnum;}
    public void setMaxscore(int newMaxscore){this.maxscore = newMaxscore;}
    public void setMinscore(int newMinscore){this.minscore = newMinscore;}
    public void setAvgscore(double newAvgscore){this.avgscore = newAvgscore;}
    public void setDefenceskill(int newDefenceskill){this.defenceskill = newDefenceskill;}
    public void setComments(String newComments){this.comments = newComments;}
    public void addAvgscore(double addedScore){
        double newAvgscore = avgscore + addedScore;
        System.out.println(newAvgscore);
    }

    // EXAMPLES OF HOW TO CREATE OBJECTS AND USE THEM
    public static void main(String[] args) {
        TeamData team3130 = new TeamData(3130, 135, 50, 87.3, 3, "mid as hell");
        TeamData team2175 = new TeamData(2175, 120, 60, 87.1, 1, "mid as hell");
        TeamData team1234 = new TeamData(1234, 110, 60, 85.4, 1, "mid as hell");
        TeamData team111 = new TeamData(111, 145, 80, 120.6, 2, "mid as hell");
        TeamData team112 = new TeamData(112, 145, 75, 110.1, 2, "mid as hell");
        TeamData team3883 = new TeamData(3883, 125, 55, 85.3, 4, "mid as hell");
        TeamData team3206 = new TeamData(3206, 145, 70, 95.7, 3, "mid as hell");
        TeamData team2883 = new TeamData(2883, 155, 85, 110.7, 4, "mid as hell");
        TeamData team9761 = new TeamData(9761, 100, 40, 65.9, 1, "mid as hell");
        TeamData team9991 = new TeamData(9991, 95, 45, 65.8, 2, "mid as hell");
        TeamData team9992 = new TeamData(9992, 95, 50, 70.6, 3, "mid as hell");

        System.out.println("team avgscore");
        System.out.println("3130 " + team3130.avgscore);
        System.out.println("2175 " + team2175.avgscore);
        System.out.println("1234 " + team1234.avgscore);
        System.out.println("111 " + team111.avgscore);
        System.out.println("112 " + team112.avgscore);
        System.out.println("3883 " + team3883.avgscore);
        System.out.println("3206 " + team3206.avgscore);
        System.out.println("2883 " + team2883.avgscore);
        System.out.println("9761 " + team9761.avgscore);
        System.out.println("9991 " + team9991.avgscore);
        System.out.println("9992 " + team9992.avgscore);
    }
}