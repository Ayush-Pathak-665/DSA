package _2Pattern.StarPattern;
import java.util.Scanner;
public class pattern9 {
    //                 *
    //             * * 
    //         * * *
    //     * * * *
    // * * * * * 
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
    int space = 2*n-2;
    int star = 1;
    while(row<=n){
        int i = 1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        i= 1;
        while(i<=star){
            System.out.print("* ");
            i++;
        }
        space-=2;
        star++;
        row++;
        System.out.println();
    }
    }
}
