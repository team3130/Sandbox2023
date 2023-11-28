import java.util.Scanner;
public class WhoIsAtFault {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        String initialobservation;
        String reasoning;

        System.out.println("is software responsible for what happened");
        initialobservation = kb.next();

        if (!(initialobservation.equals("no"))) {
            System.out.println("why do you think it is software's fault?");
            reasoning = kb.next();

            if (!(reasoning.equals("Albert says so"))){
                while (true){
                    System.out.println("ass hole");
                }
            }
            else {
                return;
            }
        }
    }
}
