package _7Sorting;
public class Insertion{
    static void sort(int arr[],int n){
        for(int i = 1;i<n;i++){                                             //i=2
            int picked = arr[i];                                            //picked = 2;
            int j = i-1;                                                    //j = 1
            while(j>=0&&arr[j]>picked){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = picked; 
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6};
        // 3,2,5,4,6
        int n = arr.length;
        sort(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}