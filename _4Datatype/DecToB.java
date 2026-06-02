import java.util.*;
public class DecToB {
    public static void main(String[] args) {
        int n = 77;
        int sum = 0;
        int mul = 1; // 10 ki power 0
        while(n>0){
            int rem = n%2;
            sum+=rem*mul;
            mul*= 10;
            n/=2;
        }
        System.out.println(sum);
    }
}
