
import java.util.Arrays;
import java.util.Collections;

public class sort5 {
    public static void main(String[] args) {
        Integer arr[] = {3,4,6,2,1,8};
        // Arrays.sort(arr , Collections.reverseOrder());
        Arrays.sort(arr ,0,4, Collections.reverseOrder());
        printArr(arr);
    }
    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
