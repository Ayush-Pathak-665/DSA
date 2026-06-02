package _2Pattern.NumberPattern;

public class Pattern24 {
    public static void main(String[] args) {
    //         1
    //       2 2 2
    //     3 3 3 3 3   
    //   4 4 4 4 4 4 4

        int n = 5;
        int row = 1;
        int space = n-1;
        int num = 1;
        int it = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=num){
                System.out.print(it+" ");
                i++;
            }
            it++;
            num+=2;
            space--;
            row++;
            System.out.println();
        }
    }
}
