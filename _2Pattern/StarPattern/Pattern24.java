package _2Pattern.StarPattern;

public class Pattern24 {
    public static void main(String[] args) {
        // * * * * * 
        // *       * 
        // *       * 
        // *       * 
        // * * * * * 

        int n = 10;
        int row = 1;
        int space = n-2;
        while(row<=n){
            if(row==1||row==n){
                int i = 1;
                while(i<=n){
                    System.out.print("* ");
                    i++;
                }
            }

            else{
                System.out.print("* ");
                int i = 1;
                while(i<=space){
                    System.out.print("  ");
                    i++;
                }
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
    }
}
