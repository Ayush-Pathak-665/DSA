package _5Functions;

public class Fun_Parameterized_Return {
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = add(a,b);
        System.out.println(c);
    }
}
