import java.util.*;
public class AnyToDecOrDecToAny {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number -: ");
        int n = s.nextInt();
        System.out.print("Enter source -: ");
        int S = s.nextInt();
        System.out.print("Enter Destination -: ");
        int D = s.nextInt();
        int sum = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%D;
            sum+= rem*mul;
            mul*=S;
            n/=D;
        }
        System.out.println(sum);
    }
}
