import java.util.Scanner;

public class EnglishIsImportantButMathIsImportanter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Number of Dudes: ");
        num1 = kb.nextInt();

        System.out.print("Number of Eunuchs: ");
        num2 = kb.nextInt();


        if (num1 >= num2){
            System.out.println("the ball count is " + (num1-num2)*2);
        }
        else {
            System.out.println("the ball count is " + (num1-num2)*2);
            System.out.println("You are an idiot, eunuch means a male who no longer has testicles, transgender women do not count to the number of eunuchs unless you also count them for the number of men." +
                    "Uncultured imbecile");
        }

        System.out.println("hehe balls");
    }
}
