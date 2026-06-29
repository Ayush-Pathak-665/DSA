package Assignments;
import java.util.*;
public class Pattern_inverted_hour_glass14 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int row = 1;
        int space = n*2-1;
        while(row<=n*2+1){
            int t = n;
            int i = 1;
            while(i<=star){
                System.out.print(t+" ");
                i++;
                t--;
            }
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            t++;
            if(row==n+1){
                k = 2;
                t++;
            }
            
            while(k<=star){
                System.out.print(t+" ");
                k++;
                t++;
            }

            if(row<=n){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            row++;
            System.out.println();
        }
    }
}

