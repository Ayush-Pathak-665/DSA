public class LeetCode189 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%arr.length;
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
}