package _2Pattern.StarPattern;
import java.util.Scanner;
public class Pattern14{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i = 1;
            while(i<=star){
                if(i%2==0){
                    System.out.print("!");
                }
                else{
                    System.out.print("*");
                }
                i++;
            }
            star+=2;
            space--;
            row++;
            System.out.println();
        }
    }
}
