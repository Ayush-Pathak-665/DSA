import java.util.Scanner;
public class Input_Array {

    static void printArr(int[] ar){
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
         for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        printArr(arr);
    }
}
