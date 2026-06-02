package _2Pattern.StarPattern;

public class Pattern26 {
    public static void main(String[] args) {
        //            * 
        //         *  *  * 
        //      *  *  *  *  *
        //   *  *  *  *  *  *  * 
        //      *  *  *  *  * 
        //         *  *  *  
        //            * 

        int n = 10;
        if(n%2==0){
            n++;
        }
        int row = 1;
        int space = n/2;
        int star = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(row<=n/2){
                space--;
                star+=2;
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
