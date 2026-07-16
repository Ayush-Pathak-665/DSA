package Assignments.Datatypes;

import java.util.Scanner;

class _1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = 1;
        int sume = 0;
        int sumo = 0;
        while(n!=0){
            if(pos%2==0){
                sume+=n%10;
            }
            else{
                sumo+=n%10;
            }
            pos++;
            n/=10;
        }
        System.out.println(sumo);
        System.out.print(sume);
    }
}