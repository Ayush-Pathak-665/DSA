package _5Functions;
import java.util.Scanner;
public class Question1 {
    public static int count(int n){
        int c = 0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }

    public static boolean armstrong(int n){
       int c = count(n);
       int sum = 0;
       int t = n;
       while(n!=0){
        int rem = n%10;
        // sum= (int)(sum + Math.pow(rem,c));
        sum+=Math.pow(rem,c);
        n/=10;
       }
       if(sum==t){
        return true;}
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Question1.armstrong(n));

    }
}
