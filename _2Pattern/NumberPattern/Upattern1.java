package _2Pattern.NumberPattern;

public class Upattern1 {
    public static void main(String[] args) {
    //          1
    //       2  2  2 
    //    3  3  3  3  3
    //       2  2  2
    //          1
        int n = 3;
        int space = n-1;
        int star = 1;
        int row = 1;
        int num = 1;
        while(row<=n*2-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print(num+" ");
                i++;
            }
            if(row<n){
                star+=2;
                space--;
                num++;
            }
            else{
                star-=2;
                space++;
                num--;
            }
            row++;
            System.out.println();
        }
    }
}
