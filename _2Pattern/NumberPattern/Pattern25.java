package _2Pattern.NumberPattern;

public class Pattern25 {
    //       1
    //     2 3 4
    //   5 6 7 8 9 
    // 10 11 12 13 14
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        int num = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            i=1;
            while(i<=star){
                System.out.print(num+"\t");
                i++;
                num++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;
        }
    }
}
