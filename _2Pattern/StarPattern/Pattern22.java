package _2Pattern.StarPattern;
import java.util.Scanner;
public class Pattern22 {
    // * * * * * * * * *
    // * * * *   * * * * 
    // * * *       * * * 
    // * *           * * 
    // *               *
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int space = 0;
        int star = n;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i=1;
            if(star==n){
                i=2;
            }
            while(i<=star){
                System.out.print("*");
                i++;
            }
            space+=2;
            if(row==1){
                space=1;
            }
            row++;
            star--;
            
            System.out.println();

        }

    }
}
