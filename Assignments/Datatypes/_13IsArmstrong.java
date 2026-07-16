package Assignments.Datatypes;

import java.util.Scanner;

public class _13IsArmstrong {
    public static boolean isArmstrong(int n){
        int sum = 0;
        int t = n;
        int digit = String.valueOf(n).length();
        while(n!=0){
            int rem = n%10;
            sum+= (int)Math.pow(rem,digit);
            n/=10;
        }
        if(t==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean Check = isArmstrong(n);
        System.out.println(Check);
    }
}
