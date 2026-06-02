package _2Pattern.StarPattern;

public class Pattern17 {
    public static void main(String[] args) {
        // * * * * * 
        //     * * * * 
        //         * * *
        //             * * 
        //                * 
        //             * *
        //         * * * 
        //     * * * *  
        // * * * * *    
        int n = 10;
        int row = 1;
        int space = 0;
        int star = n;
        while(row<=n*2-1){
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

            if(row<n){
                space+=2;
                star--;
            }
            else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
        
    }
}
