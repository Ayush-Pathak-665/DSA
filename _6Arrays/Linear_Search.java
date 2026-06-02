import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        int []arr = new int[5];
        int item = 5;
        Scanner s = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        System.out.println(Search(arr,item));
    }

    public static int Search(int arr[],int item){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==item)
                return i;

        }
        return -1;
    }
}
