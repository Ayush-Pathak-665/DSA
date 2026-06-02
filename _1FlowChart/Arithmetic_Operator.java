package _1FlowChart;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 9;
        int c;


        c = a+b;
        System.out.println("Addition is "+c);

        c = a-b;
        System.out.println("Subtraction is -:"+c);

        c = a*b;
        System.out.println("Multiplication is -:"+c);

        c = a/b;
        System.out.println("Division is -: "+c);

        c = a%b;
        System.out.println("Modulus is -: "+c);


        System.out.println(a++);
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);
        


        System.out.println(a--);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(a);

    }
}
