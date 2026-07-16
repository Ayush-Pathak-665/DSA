package Assignments.Pattern;
    import java.util.*;
public class Pattern_Mountane9 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int space = n*2-3;
        while(row<=n){
            int i = 1;
            while(i<=row){
                System.out.print(i+"\t");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int L = row;
            int k = 1;
            if(row==n){
                k=2;
                L = row-1;
            }
            while(k<=row){
                System.out.print(L+"\t");
                L--;
                k++;
            }

            System.out.println();
            space-=2;
            row++;
        }

    }
}
