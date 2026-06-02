package _3Programs;
public class Fibo {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        // System.out.print(a+" "+b);
        for(int i = 1;i<=n;i++){
            System.out.print(" "+a);
            int c = a + b;
            // System.out.print(" "+c);
            a = b;
            b = c;

        }
    }
}