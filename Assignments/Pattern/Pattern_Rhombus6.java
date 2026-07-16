package Assignments.Pattern;

import java.util.Scanner;

public class Pattern_Rhombus6 {
                    //      1
                    //    2 3 2
                    //  3 4 5 4 3
                    //    2 3 2
                    //      1
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        int num = 0;
        while(row<=n*2-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                if(j<=star/2+1){
                    num++;
                }
                else{
                    num--;
                }
                System.out.print(num+" ");
                j++;
            }
            row++;
            System.out.println();
            if(row<=n){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
        }
    }
}
