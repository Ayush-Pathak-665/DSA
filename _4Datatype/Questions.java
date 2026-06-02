import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        // Take the following as input.

        // Minimum Fahrenheit value
        // Maximum Fahrenheit value
        // Stęp

        // Print as output the Celsius conversions. Use the formula C = (5/9)(F - 32) E.g. for an input of 0, 100 and 20 the
        // output is
        // 0-17
        // 20-6 
        // 40 4
        // 60 15
        // 80 26
        // 100 37
        Scanner s = new Scanner(System.in);
        // int minf = s.nextInt();
        // int maxf = s.nextInt();
        // int step = s.nextInt();

        // for(int i =minf;i<=maxf;i+=step){
        //     int c = (int)((5.0/9)*(i-32));
        //     System.out.println(i+" - "+c);
        // }



        // Take the following as input.
        // A number
        // Assume that for a number of n digits, the value of each digit is 
        // from 1 to n and is unique. E.g. 32145 is a valid input
        // number.

        // Write a function that returns its inverse, where inverse is defined as follows

        // Inverse of 32145 is 12543. In 32145, "5" is at 1st place, therefore in 12543,
        // "1" is at 5th place; in 32145, "4" is at 2nd
        // place, therefore in 12543, "2" is at 4th place.

        // Print the value returned.

        int n = s.nextInt();
        int sum = 0, pos = 1;
        while(n!=0){
            int rem = n%10;
            sum+=pos*Math.pow(10,rem-1);
            pos++;
            n/=10;
        }
        System.out.println(sum);



        
    }
}
