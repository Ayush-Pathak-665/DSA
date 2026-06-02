public class Reverse_Specefic_Range {
    public static void reverse(int arr[],int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,7,9,11,15,18};
        // Range from 2 index to 6 index
        reverse(arr,2,6);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
