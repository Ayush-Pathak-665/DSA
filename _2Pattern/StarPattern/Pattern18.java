package _2Pattern.StarPattern;

public class Pattern18 {
    public static void main(String[] args) {

//            * * * * * 
//          * * * *  
//        * * *
//      * * 
//    * 
//      * * 
//        * * * 
//          * * * * 
//            * * * * * 
        int n = 10;
        int row = 1;
        int star = n;
        int space = n-1;
        while(row<=n*2-1){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            if(row<n){
                star--;
                space--;
            }
            else{
                star++;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
