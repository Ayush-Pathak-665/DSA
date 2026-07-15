public class Leetcode42Trappingrainwater{
    public static int Maximum(int start, int end,int arr[]){
        int max = arr[start];
        for(int k = start;k<=end;k++){
            if(max<arr[k]){
                max = arr[k];
            }
        }
        return max;
    }
    public static void main(String ar[]){
        int arr[] = {4,2,0,3,2,5};
        int n = arr.length;
        int sum= 0;
        for(int i = 0;i<n;i++){
            int maxleft = Maximum(0, i, arr);
            int maxright = Maximum(i, n-1, arr);
            int min = maxleft;
            if(min>maxright){
                min = maxright;
            }
            sum+=min-arr[i];

        }
        System.out.println(sum);
    }
}