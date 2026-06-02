package _2Pattern.NumberPattern;

public class Pattern26 {
    public static void main(String[] args) {
    //          1
    //        1 2 3 
    //      1 2 3 4 5 
    //    1 2 3 4 5 6 7 

        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i=1;
            while(i<=star){
                System.out.print(i+" ");
                i++;
            }
            row++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
// 