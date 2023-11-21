import java.util.Scanner;

public class EnglishIsImportantButMathIsImportanter {
    public static void English(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1;
        int num2 = 0;

        System.out.print("Number of Dudes: ");
        num1 = kb.nextInt();

        System.out.print("Number of Eunics: ");
        num2 = kb.nextInt();



        System.out.println("the ball count is" + (num1-num2)*2);

        System.out.println("hehe balls");
    }
}
