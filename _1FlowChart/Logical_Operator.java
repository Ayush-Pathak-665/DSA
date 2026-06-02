package _1FlowChart;

public class Logical_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a<b && a!=b){
            System.out.println("true");
        }
        if(a>b || a!=b){
            System.out.println("true");
        }
        if(!(a>b)){
            System.out.println("true");
        }
    }
}
