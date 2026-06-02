package _2Pattern.NumberPattern;

public class Pattern23 {
    public static void main(String[] args) {
        //          1
        //        1 1 1
        //      1 1 1 1 1
        //    1 1 1 1 1 1 1
        //  1 1 1 1 1 1 1 1 1
        int n = 5;
        int row = 1;
        int space = n-1;
        int num = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i= 1;
            while(i<=num){
                System.out.print("1 ");
                i++;
            }
            row++;
            num+=2;
            space--;
            System.out.println();
        }
    }
}
