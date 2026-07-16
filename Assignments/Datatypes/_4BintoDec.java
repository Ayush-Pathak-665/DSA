package Assignments.Datatypes;

import java.util.Scanner;

class _4BintoDec{
    public static void main(String ar[]){
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        int dec = 0;
        while(n!=0){
            dec+=(int)Math.pow(2,c)*(n%10);
            n/=10;
            c++;
        }
        System.out.println(dec);

    }
}