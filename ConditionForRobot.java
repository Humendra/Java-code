import java.util.*;

public class ConditionForRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1 , 2 or 3");
        int button = sc.nextInt();

        ///if(button==1){
        ///    System.out.println("HELLO");
        ///}else if (button==2){
        ///    System.out.println("NAMASTE");
        ///}else if (button==3) {
        ///    System.out.println("BONJOUR");
        ///}else
        ///    System.out.println("INVALID BUTTON !!!");

        /// THIS IS THE SPECIAL COMMAND USE FOR CHECKING SAME VARIABLE CONDITION AGAIN AND AGAIN !!!
        switch(button){
            case 1 : System.out.println("HELLO");
            break;
            case 2 : System.out.println("NAMASTE");
            break;
            case 3 : System.out.println("BONJOUR");
            break;
            default : System.out.println("INVALID BUTTON !!!!");
        }


    }
}