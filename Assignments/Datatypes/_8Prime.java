package Assignments.Datatypes;

import java.util.Scanner;

public class _8Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
