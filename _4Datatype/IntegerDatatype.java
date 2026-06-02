// package _4Datatype;
import java.util.Scanner;
public class IntegerDatatype {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 390;
        byte b = (byte)128;
        // short s1 = 10;
        // long l = 10;

        b = (byte)i;
        System.out.println(b);

       byte b1 = s.nextByte();
        System.out.println(b1);

        long l = s.nextLong();
        System.out.println(l);

        int x = s.nextInt();
        System.out.println(x);


    }
}
