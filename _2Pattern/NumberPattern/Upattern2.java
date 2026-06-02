package _2Pattern.NumberPattern;

public class Upattern2 {
    public static void main(String[] args) {
    //         1
    //      2  3  2
    //   3  4  5  4  3
    //      2  3  2
    //         1
        int n = 3;
        int space = n-1;
        int row = 1, star = 1;
        
        while(row<=n*2-1){
            int i = 1;
            int num = row;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print(num+" ");
                if(i<=star/2){
                    num++;
                }
                else{
                    num--;
                }
                i++;
            }

            if(row<n){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
