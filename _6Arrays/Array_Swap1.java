public class Array_Swap1 {
    public static void swap(int[]arr,int[]other){
        int[] temp = arr;
        arr = other;
        other = temp;
 }
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        int []other = {100,200,300,500};
        
        // int temp[] = arr;
        // arr = other;
        
        // other = temp;
        // ye jo upar kiya hai wo isi main me ho gya change toh ye globally change ho gya leking function
        // calll karke jo kiya hai usme change nahi hoga kyuki swap method me change hua hai to wo change 
        // locally hai

        // swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }
}
