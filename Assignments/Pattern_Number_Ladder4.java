package Assignments;

import java.util.Scanner;

public class Pattern_Number_Ladder4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int number = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print(number);
                i++;
                number++;
            }
            star++;
            row++;
            System.out.println();
        }
    }

}
