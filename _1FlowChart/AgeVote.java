package _1FlowChart;
import java.util.Scanner;

public class AgeVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18)
            System.out.println("can vote");
        else
            System.out.println("Cannnot Vote");
    }
}
