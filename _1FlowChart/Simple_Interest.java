package _1FlowChart;
import java.util.*;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle -: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate -: ");
        int r = sc.nextInt();
        
        System.out.print("Enter Time -: ");
        int t = sc.nextInt();
        
        
        System.out.println((p*r*t)/100);
    }
}
