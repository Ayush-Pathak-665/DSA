package Assignments.Pattern;
// Take N (number of rows), print the following pattern (for N = 4).

import java.util.Scanner;

//                        1 
//                      2 3 2
//                    3 4 5 4 3
//                  4 5 6 7 6 5 4

// Input Format

// Constraints
// 0 < N < 10


// Output Format

// Sample Input
// 4
// Sample Output
//             1
// 		2	3	2
// 	3	4	5	4	3
// 4	5	6	7	6	5	4
// Explanation
// Each number is separated from other by a tab.
public class Pattern_Trangle2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int k = row;
            while(j<=star){
                System.out.print(k+"\t");
                if(j>=star/2+1){
                    k--;
                }
                else{
                    k++;
                }
                j++;
            }
            star+=2;
            space--;
            row++;
            System.out.println();

        }
    }
}
