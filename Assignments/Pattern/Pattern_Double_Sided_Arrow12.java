package Assignments.Pattern;
import java.util.Scanner;


public class Pattern_Double_Sided_Arrow12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int spaceo = n-1;
        int spacei = -1;
        int star = 1;
        while(row<=n){
            int i = 1;
            while(i<=spaceo){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int no = star;
            while(j<=star){
                System.out.print(no+" ");
                no--;
                j++;
            }
            int k = 1;
            while(k<=spacei){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            if(row==1 || row==n){
                l=2;
            }
            while(l<=star){
                System.out.print(l+" ");
                l++;
            }

            if(row>=n/2+1){
                spaceo+=2;
                spacei-=2;
                star--;
            }
            else{
                spaceo-=2;
                spacei+=2;
                star++;
            }
            System.out.println();
            row++;
        }
    }
}

