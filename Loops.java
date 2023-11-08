public class Loops{
    public static void main(String[] args) {
        // for( value ; Terminating statement ; updation command );
        // i++ is increatment operator.
        int n= 5;
        int number = 1;
        for(int i = 1; i <= n ; i++){
            for (int j =1; j <= i; j++){
                //int spaces = 2*(n-i);
                System.out.print(number+" ");
                number++;
                //System.out.print(spaces);

            }
            System.out.println();
        }
    }
}