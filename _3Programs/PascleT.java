package _3Programs;
class PascleT {
    static int fact(int n){
    int facto = 1;
    while(n!=0){
        facto*=n;
        n--;
    }
    return facto;
}
    public static void main(String[] args) {
        int n = 6;
        int row = 0;
        int star = 0;
        while(row<=n-1){
            int i = 0;
            while(i<=star){
                System.out.print(fact(row)/(fact(row-i)*fact(i))+" ");
                i++;
            }
            System.out.println();
            row++;
            star++;
        }
    }
}
