package Assignments.Datatypes;

import java.util.Scanner;

public class _5NthFibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1,n2;
        n1 = 0;
        n2 = 1;
        for(int i = 2;i<=n;i++){
            int t = n1;
            n1 = n2;
            n2 = n2 + t;
        }
        System.out.print(n2);
    }
}
