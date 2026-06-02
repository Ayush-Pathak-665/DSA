package _3Programs;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int divisior = 36;
        int divident = 60;
        while(divident%divisior!=0){
            int rem = divident%divisior;
            divident = divisior;
            divisior = rem;
        }
        System.out.println(divisior);
    }
}
