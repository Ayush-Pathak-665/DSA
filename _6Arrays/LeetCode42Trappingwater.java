public class LeetCode42Trappingwater {

    public static void main(String ar[]){
        int arr[] = {4,2,0,3,2,5};
        int left[] = MaximumL(arr);
        int right[] = MaximumR(arr);
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+= Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(sum);
         
    }

    public static int[] MaximumL(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]); 
        }
        return left;
    }
    public static int[] MaximumR(int arr[]){
        int n = arr.length;
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        return right;
    }
}
