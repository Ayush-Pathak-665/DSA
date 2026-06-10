package _7Sorting;

public class Bubble {
    public static void sort(int arr[],int n){
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(j,arr);
                }
            }
        }
    }
    public static void swap(int j,int arr[]){
        int t = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = t;
    }

    public static void main(String[] args) {
        int arr[] = {2,13,-2,-4,7,8};
        int n = arr.length;
        sort(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
