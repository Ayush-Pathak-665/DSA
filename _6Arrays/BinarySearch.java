public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,5,10,20,23};
        int l = 0;
        int u = arr.length;
        int item = 5;
        while(l<=u){
            int mid = (l+u)/2;
            if(arr[mid]==item){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>item){
                u = mid-1;
            }
            else{
                l = mid+1;
            }
        }

    }
}
