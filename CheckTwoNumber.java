import java.util.Scanner;
public class CheckTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("BOTH NUMBER IS EQUAL");
        }
        else if (a>b){
            System.out.println("FIRST NUMBER IS GREATERE THAN SECOND");
        }
        else if (b>a){
            System.out.println("SECOND NUMBER IS GREATER THAN FIRST");
        }//System.out.println("FIRST NUMBER:"+a);
        //System.out.println("SECOND NUMBER:"+b);
    }
}
