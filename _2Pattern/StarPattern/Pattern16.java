package _2Pattern.StarPattern;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        //         *
        //       * * 
        //     * * * 
        //   * * * * 
        // * * * * * 
        //   * * * * 
        //     * * * 
        //       * * 
        //         *

        int n = 20;
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=n*2-1){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            if(row<n){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
            row++;
            System.out.println();

        }
    }
}
