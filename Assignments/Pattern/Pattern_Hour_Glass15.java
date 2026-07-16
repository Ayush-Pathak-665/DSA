package Assignments.Pattern;
    import java.util.*;
public class Pattern_Hour_Glass15 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int space = 0;
        int star = n*2+1;
        int t = n;
        while(row<=n*2+1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int no = t;
            while(j<=star){
                System.out.print(no+" ");
                if(j>=t+1){
                    no++;
                }
                else{
                    no--;
                }
                j++;
            }
            if(row<=n){
                space++;
                star-=2;
                t--;

            }
            else{
                space--;
                star+=2;
                t++;
            }
            System.out.println();
            row++;
        }
    }
}
