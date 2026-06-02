import java.util.Scanner;
public class AnyToAny {

    static void AnyToDec(int n, int S,int D){
        int sum = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%10;
            sum+=rem*mul;
            mul*=S;
            n/=10;
        }
        DecToAny(sum,D);
    }
    static void DecToAny(int n, int D){
        int sum = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%D;
            sum+=rem * mul;
            mul*= 10;
            n/=D;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number -: ");
        int n = s.nextInt();
        System.out.print("Enter source -: ");
        int S = s.nextInt();
        System.out.print("Enter Destination -: ");
        int D = s.nextInt();
        AnyToDec(n,S,D);

    }
}
