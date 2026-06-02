package _2Pattern.NumberPattern;

public class Pattern28 {
//           1
//        2  3  2
//     3  4  5  4  3
//  4  5  6  7  6  5  4 
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        
        while(row<=n){
            int num = row;
            int i = 1;
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
            System.out.println();
            star+=2;
            space--;
            row++;
        }
    }

}
