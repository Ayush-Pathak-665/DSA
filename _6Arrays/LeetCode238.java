class LeetCode238 {
    public static int[] LeftMul(int arr[],int n){
        int left[] = new int[n];
        left[0] = 1;
        for(int i = 1;i<n;i++){
            left[i] = left[i-1]*arr[i-1];
        }
        return left;
    }
    public static int[] RightMul(int arr[],int n){
        int right[] = new int[n];
        right[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1]*arr[i+1];
        }
        return right;
    }
    public static void main(String ar[]) {
        int nums[] = {1,2,3,4};
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left = LeftMul(nums,n);
        right = RightMul(nums,n);
        int answer[] = new int[n];
        for(int i = 0;i<n;i++){
            answer[i] = left[i]*right[i];
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}