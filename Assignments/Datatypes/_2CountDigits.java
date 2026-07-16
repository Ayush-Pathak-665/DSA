package Assignments.Datatypes;

import java.util.Scanner;

public class _2CountDigits {
    public static int count(int n, int d){
        int c = 0;
        while(n!=0){
            if(n%10==d){
                c++;
            }
            n/=10;
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        System.out.print(count(n,d));
    }
}
