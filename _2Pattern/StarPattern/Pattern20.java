package _2Pattern.StarPattern;

public class Pattern20 {
    public static void main(String[] args) {
        // * * * * * * * 
        // * * *   * * * 
        // * *       * * 
        // *           * 
        // * *       * * 
        // * * *   * * * 
        // * * * * * * * 

        int n = 10;
        if(n%2==0){
            n+=1;
        }
        int star = n/2+1;
        int space =-1;
        int row = 1;
        while(row<=n){
            int i = 1;
            if(row==1||row==n){
                i=2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            i = 1;
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
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;


        }

    }
}
