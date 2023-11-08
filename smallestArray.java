public class smallestArray {
    public static int getsmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i=0 ; i<number.length ; i++){

            if ( smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]) {

        int number[]={1,2,6,3,5};
        int smallest = getsmallest(number);
        System.out.println("smallest value is :"+smallest);
        
    }
    
}
