package _2Pattern.StarPattern;

public class Pattern23 {
    //           *
    //        *     *
    //     *           *
    //  *                 *
    //     *           *
    //        *     *
    //           *

    public static void main(String[] args) {
        int n = 10;
        if(n%2==0){
            n++;
        }
        int Ospace = n/2;
        int ispace = -1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=Ospace){
                System.out.print("  ");
                i++;
            }
            i = 1;
                System.out.print("* ");
            while(i<=ispace){
                System.out.print("  ");
                i++;
            }
            if(row>1&&row<n){
                System.out.print("* ");
            }
            if(row<=n/2){
                Ospace--;
                ispace+=2;
            }
            else{
                Ospace++;
                ispace-=2;
            }
            System.out.println();
            row++;
        }
    }
}
