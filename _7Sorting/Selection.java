package _7Sorting;

public class Selection {
    public static void sort(int arr[],int  n){
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j= i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(i,min,arr);
        }
    }
    public static void swap(int i, int j, int arr[]){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,-7,4,8,2};
        int n = arr.length; 
        sort(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
