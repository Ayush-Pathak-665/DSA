package _2Pattern.NumberPattern;

public class Pattern27 {
//             1
//          1  2  1
//       1  2  3  2  1
//    1  2  3  4  3  2  1
// 1  2  3  4  5  4  3  2  1
public static void main(String[] args) {
    int n = 5;
    int space = n-1;
    int star = 1; 
    int row = 1;
    while(row<=n){
        int i = 1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        i = 1;
        int num = 1;
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
        row++;
        star+=2;
        space--;
    }
}
}
