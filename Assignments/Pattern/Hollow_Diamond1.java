package Assignments.Pattern;
// Take N (number of rows), print the following pattern (for N = 5).

//      * * * * *
//      * *   * *
//      *       *
//      * *   * *
//      * * * * *

// Input Format

// Constraints
// 0 < N < 10 (where N is an odd number)


// Output Format

// Sample Input
// 5
// Sample Output
// *	*	 *    *      *		  
// *	*	      *      *
// * 	                 *
// * 	*         *      *
// * 	*	 *    *      *	
// Explanation
// Each '*' is separated from other by a tab.
import java.util.*;
public class Hollow_Diamond1{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = n/2+1;
        int space = -1;
        int row = 1;
        while(row<=n){
        
            int i = 1;
            if(row==1 || row==n){
                i = 2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            row++;
            if(row>n/2+1){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
}
