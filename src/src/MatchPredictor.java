import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import TeamData.TeamData;

public class MatchPredictor {

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

        Scanner kb = new Scanner(System.in);
        String blue1;
        String blue2;
        String blue3;
        String red1;
        String red2;
        String red3;



        System.out.println("what is the first blue team?");
        blue1 = kb.nextLine();
        blue1.equals(kb.nextLine());
        System.out.println("what is the second blue team?");
        blue2 = kb.nextLine();
        blue2.equals(kb.nextLine());
        System.out.println("what is the third blue team?");
        blue3 = kb.nextLine();
        blue3.equals(kb.nextLine());
        System.out.println("what is the first red team?");
        red1 = kb.nextLine();
        red1.equals(kb.nextLine());
        System.out.println("what is the second red team?");
        red2 = kb.nextLine();
        red2.equals(kb.nextLine());
        System.out.println("what is the third red team?");
        red3 = kb.nextLine();
        red3.equals(kb.nextLine());

    }
}
