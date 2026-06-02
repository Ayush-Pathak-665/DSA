public class Reverse {
    public static void swap(int i, int j, int arr[]){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(i,j,arr);
            i++;
            j--;
        }

        for(int z = 0;z<arr.length;z++){
            System.out.println(arr[z]);
        }
    }
}
