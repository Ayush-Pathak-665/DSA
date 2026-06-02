package _2Pattern.NumberPattern;

public class Upattern{
    //         1
    //      1  2  1
    //   1  2  3  2  1
    //      1  2  1 
    //         1
    public static void main(String[] args) {
        int n = 3;
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<=n*2-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i=1;
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

            if(row<n){
                star+=2;
                space--;
            }
            else{
                space++;
                star-=2;
            }
            row++;
            System.out.println();

        }
    }
}
