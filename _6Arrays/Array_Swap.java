import java.util.*;
public class Array_Swap {
    public static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an array -: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter element "+i+" -: ");
            arr[i] = s.nextInt();
        }
        swap(arr,0,1);
        System.out.println(arr[0]+"  "+arr[1]);

    }
}
