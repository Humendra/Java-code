/*public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);

    }
}*/
public class TypePromotion{
    public static void main(String[] args) {
        short a = 5;
        byte b = 25;
        char c = 'c';

        //byte bt = a + b + c;

        byte bt = (byte) (a + b + c);     // lossy conversion
    
        System.out.println(bt);
    }
}
