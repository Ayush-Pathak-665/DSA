package _2Pattern.StarPattern;
import java.util.*;
public class Pattern12{

    // * * * * * 
    //   * * * 
    //     *    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    int space = 0;
    int star = n*2-1;
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
        star-=2;
        space++;
        row++;
        System.out.println();


    }
    }
    
}
