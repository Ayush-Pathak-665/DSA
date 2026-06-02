package _2Pattern.StarPattern;
import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // *               *
        // * *           * * 
        // * * *       * * * 
        // * * * *   * * * *
        // * * * * * * * * * 
        int n = s.nextInt();
        int space = n*2-3;
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=star){
                if(n==row&&i==star){
                    break;
                }
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            space-=2;
            star++;

        }
    }
}
