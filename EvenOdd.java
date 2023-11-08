import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER ANY NUMBER WHICH YOU WANT TO CHECK");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
    }
}
