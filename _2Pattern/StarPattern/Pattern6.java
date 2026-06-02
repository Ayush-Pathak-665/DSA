package _2Pattern.StarPattern;
import java.util.Scanner;
public class Pattern6 {
    // * * * * *
    //     * * * *
    //         * * *
    //             * *
    //                 *
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
    int n = ss.nextInt();
    int row = 1;
    int space = 0;
    int star = n;
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
        space+=2;
        star--;
        row++;
        System.out.println();
    }
    }
    
}
