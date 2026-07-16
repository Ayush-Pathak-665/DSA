package Assignments.Datatypes;

import java.util.Scanner;

public class _9replace0to5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long n1 = 0;
        long pos = 1;
        if(n==0){
            System.out.println(5);
            return;
        }
        long digit = 0;
        while(n!=0){
            digit = n%10;
            if(digit==0){
                digit = 5;
            }
            n1+=digit * pos;
            pos*=10;
            n/=10;
        }
        System.out.println(n1);
    }
}
