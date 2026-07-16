package Assignments.Datatypes;
import java.util.Scanner;

public class _11SimpleInput {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = s.nextInt();
            int t = sum+n;
            if(t<0){
                break;
            }
            else{
                System.out.println(n);
                sum+=n;
            }

        }
    }
}
