import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE :");
        int AGE = sc.nextInt();

        if (AGE > 18) {
            System.out.println("YOU ARE ADULT");
        }else {
            System.out.println("YOU ARE NOT ADULT");
        }
    }
}