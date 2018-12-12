package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};

        int n= array.length;
        int total=((n+1) * (n+2)/2);
        for(int i:array){
            total-=i;
        }
        System.out.println("The Missing number is : "+total);}

    public static int findMissingNumber(int[] array){

        int length = array.length;
        int total = ((length+1) * (length+2))/2;
        for(int i=0;i<array.length;i++){
            total -= array[i];
        }
        return total;
    }}
/*
    public static void main(String[] args) {
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number: "+findMissingNumber(array));
}
*/
