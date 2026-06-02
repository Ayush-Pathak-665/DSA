package _2Pattern.StarPattern;
import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args) {
        // * * * * * 
        //   * * * * 
        //     * * * 
        //       * * 
        //         * 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = n;
        int space = 0;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            star--;
            space++;
            row++;
            System.out.println();
        }

    }
}
