package Assignments;

import java.util.Scanner;

public class Hollow_rohmbus5 {
//     *****
//    *   *
//   *   *
//  *   *
// *****
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 5;
        int space = n-1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            if(row==1 || row==n){
                int j = 1;
                while(j<=star){
                    System.out.print("*"+" ");
                    j++;
                }
            }
            else{
                System.out.print("*"+" ");
                System.out.print("      ");
                System.out.print("*");
            }
            space--;
            row++;
            System.out.println();
        }
    }
}
