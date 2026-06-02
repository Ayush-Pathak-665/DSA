public class Maximum_Element {
    public static void main(String[] args) {
        int arr[] = {10,-1,1,0,7,12};
        int arr1[] = {-2,-1,-3,-4};
        System.out.println(Greatest(arr));
        System.out.println(Greatest1(arr1));
    }
    public static int Greatest(int arr[]){
        int great = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(great<arr[i]){
                great = arr[i];
            }
        }
        return great;
    }
    public static int Greatest1(int arr[]){
        int great = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length;i++){
            great = Math.max(arr[i],great);
            // if(great<arr[i]){
            //     great = arr[i];
            // }
        }
        return great;
    }
}

