package Assignments.Pattern;
// Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

import java.util.Scanner;

//       *
//    *  *  *  
// *  *  *  *  *  
//    *  *  *
//       *

// Input Format

// Constraints
// 0 < N < 10 (only odd numbers allowed)


// Output Format

// Sample Input
// 5
// Sample Output
//       *
//     * * *
//   * * * * *
//     * * *
//       *
// Explanation
// Each '*' is separated from other by a tab.
public class Mirror_Star3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int space = n/2+1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print("*"+"\t");
                i++;
            } 
            row++;
            if(row<=n/2+1){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
        }

    }
}
