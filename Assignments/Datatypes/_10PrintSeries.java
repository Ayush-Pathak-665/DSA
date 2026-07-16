package Assignments.Datatypes;

import java.util.Scanner;

public class _10PrintSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = s.nextInt();
        int c = 1;
        int i = 1;
        while(c<=n){
            int nums = 3*i+2;
            if(nums%n1!=0){
                System.out.println(nums);
                c++;
            }
            i++;
        }
    }
}
