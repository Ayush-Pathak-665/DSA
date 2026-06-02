
public class BinToDec {
    public static void main(String[] args) {
        int n = 101101;
        int mul = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem * mul;
            mul*=2;
            n/=10;
        }
        System.out.println(sum);
    }
}
