package Assignments.Pattern;
import java.util.*;
public class PatternFibo8 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int row = 1;
        int star = 1;
        int i = 0;
        int j = 1;
        while(row<=N){
            int k = 1;
            while(k<=star){
                System.out.print(i+" ");
                int t = i;
                i = j;
                j = j+t;
                k++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}

