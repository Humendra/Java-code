import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;

        //int b = a;  // Lossy conversion
        //System.out.println(b);

        int b = (int) a;
        System.out.println(b);

        //output : 25

        // Type casting have some loss of data 
    }
    
}
