package _2Pattern.StarPattern;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 10;
        if(n%2==0){
            n++;
        }
        int row = 1;
        int ospace = 0;
        int ispace = n-2;
        while(row<=n){
            int i = 1;
            while(i<=ospace){
                System.out.print("  ");
                i++;
            }
            System.out.print("* ");
            i = 1;
            while(i<=ispace){
                System.out.print("  ");
                i++;
            }
            if(row!=n/2+1){
                System.out.print("* ");
            }

            if(row<=n/2){
                ispace-=2;
                ospace++;
            }
            else{
                ispace+=2;
                ospace--;
            }
            System.out.println();
            row++;
        }
    }
}
