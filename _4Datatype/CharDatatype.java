// package _4Datatype;
import java.util.*;
public class CharDatatype{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = 'a';
        System.out.println((int)ch);

        ch++;
        System.out.println(ch);

        ch = (char) (ch+1);
        System.out.println(ch);

        char c = s.next().charAt(0); 

        System.out.println((char)(c+ch));
    }

}