import java.util.Arrays;

public class sort4 {
    public static void main(String[] args) {
        int arr[] = {3,4,6,2,1,8};
        Arrays.sort(arr,0,4);
        // Arrays.sort(arr,0,4);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
