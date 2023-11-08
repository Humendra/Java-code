import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtract");
        System.out.println("Enter 3 for division");
        System.out.println("Enter 4 for multiply");

        System.out.println("Enter choice number");
        int user = sc.nextInt();

        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        if (user==1)
        {
            int sum = num1+num2;
            System.out.println("ANSWER:"+sum);
        }

        else if (user==2)
        {
            int sum = num1 - num2;
            System.out.println("ANSWER:"+sum);
        }
 
        else if (user==3)
        {
            int sum = num1 / num2;
            System.out.println("ANSWER:"+sum);
        }

        else if (user==4)
        {
            int sum = num1 * num2;
            System.out.println("ANSWER:"+sum);
        }
    }
}