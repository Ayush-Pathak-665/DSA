package _2Pattern.StarPattern;
public class Pattern19 {
    public static void main(String[] args) {
        // * * *  * * *
        // * *      * *
        // *          *
        
        // *          *
        // * *      * *  
        // * * *  * * *  

        int n = 10;
        if(n%2==0){
            n+=1;
        }
        int row = 1;                                   // *** ***
        int space = 1;                                 // **   **
        int star = n/2;                                // *     *                                       
        while(row<=n){    
            if(row==(n/2)+1){
                row++;
                System.out.println();
                star+=1;
                space-=2;
                continue;
            }                        
            int i = 1;                                          
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            if(row>(n/2)+1){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            row++;
           


           
        }

    }
}
