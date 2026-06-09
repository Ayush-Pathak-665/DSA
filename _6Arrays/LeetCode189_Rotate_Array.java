public class LeetCode189_Rotate_Array {
    public static void rotateBruteForce(int arr[],int k){
        while(k>0){
            int item = arr[arr.length-1];
            int i = arr.length-2;
            while(i>=0){
                arr[i+1] = arr[i];
                i--;
            }
            arr[0] = item;
            k--;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void rotateOptimizeApproch(int arr[],int k){
        int i = 0;
        int n = arr.length;
        int j = (n-k)-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        i = n-k;
        j = n-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        i = 0;
        j = n-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
         for (int x: arr) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        // Brute force
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%arr.length;
        // rotateBruteForce(arr, k);
        rotateOptimizeApproch(arr,k);
    }
}