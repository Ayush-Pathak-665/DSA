package Assignments.Datatypes;

import java.util.Scanner;

public class _12Armstrong {
    public static void checkarm(int n1, int n2){
        for(int i = n1;i<n2;i++){
            int digits = String.valueOf(i).length();
            int t = i;
            int sum = 0;
            while(t!=0){
                int rem = t%10;
                sum+=Math.pow(rem,digits);
                t/=10;
            }     
            if(i==sum){
                System.out.println(i);
            }

        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        checkarm(n1,n2);
    }
}
