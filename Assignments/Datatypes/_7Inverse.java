package Assignments.Datatypes;

import java.util.Scanner;

public class _7Inverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = 1;
        int n1 = 0;
        while(n!=0){
            int rem = n%10;
            rem--;
            n1+= pos* (int)Math.pow(10,rem);
            n/=10;
            pos++;
        }
        System.out.print(n1);
    }
}
