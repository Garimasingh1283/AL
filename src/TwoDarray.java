import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
 /*
 123
 456
 789
 (3x3 matrix type reperesntation
//  */

//        syntax:
        Scanner in = new Scanner(System.in);
        int[][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

// input
        for (int row=0; row< arr.length; row++){
            for (int col= 0; col<arr[row].length; col++){
                System.out.print (arr[row][col] + " ");
            }
            System.out.println();


        }
//        output
        for (int row= 0 ; row<arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
