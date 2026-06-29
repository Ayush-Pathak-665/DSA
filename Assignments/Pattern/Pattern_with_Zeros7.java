package Assignments;

import java.util.Scanner;

public class Pattern_with_Zeros7 {
// 1
// 2 2
// 3 0 3
// 4 0 0 4
// 5 0 0 0 5
public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                if(i==1||i==star){
                    System.out.print(star+" ");
                }
                else{
                    System.out.print("0 ");
                }
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
