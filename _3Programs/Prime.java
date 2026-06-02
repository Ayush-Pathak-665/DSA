package _3Programs;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }
}
