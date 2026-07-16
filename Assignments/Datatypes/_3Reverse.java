package Assignments.Datatypes;

import java.util.Scanner;

public class _3Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev = 0;
        while(n!=0){
            rev = rev * 10 + n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
