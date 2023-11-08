public class Adv_Pattern {

    public static void hollow_rectangle(int totalrows , int totalcols){

        for ( int i=1 ; i<=totalrows ; i++){

            for (int j=1 ; j<=totalcols ; j++){

                if ( i==1 || i==totalrows || j==1 || j==totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n){
        //outer loop 
        for ( int i=1 ; i<=n ; i++){
            //spaces 
            for ( int j=1 ; j<=n-i ; j++ ){
                System.out.println(" ");
            
            }
            //stars
            for ( int j=1 ; j<=i ; j++ ){
                System.out.print("*");
            }
            System.out.println();   
        }
    }
    public static void main(String[] args) {
        //hollow_rectangle(4,5);  
        inverted_half_pyramid(4);
    }
}
