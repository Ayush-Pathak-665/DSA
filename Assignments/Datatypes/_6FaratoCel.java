package Assignments.Datatypes;

import java.util.Scanner;

public class _6FaratoCel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int MinF = s.nextInt();
        int MF = s.nextInt();
        int st = s.nextInt();
        for(int i = MinF;i<=MF;i+=st){
            System.out.println(i + " " + ((i - 32) * 5 / 9));
        }
    }
}
