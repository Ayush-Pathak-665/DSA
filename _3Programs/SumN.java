package _3Programs;

public class SumN {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0, rem;
        while(n!=0){
            rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
