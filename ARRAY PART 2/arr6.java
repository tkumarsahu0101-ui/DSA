import java.util.Arrays;
public class arr6 {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int tar = 9;
        twoSum(arr, tar);
    }
    // public static void twoSum(int arr[] , int tar){
    //     // brute force approach
    //     for(int i = 0; i<arr.length; i++){
    //         for(int j = i+1; j<arr.length; j++){
    //             int sum = arr[i] + arr[j];
    //             if(sum == tar){
    //                 System.out.println("["+i+","+j+"]");
    //             }
    //         }
    //     }
    // }
    public static int[] twoSum(int arr[], int tar) {
        // Two Pointer Approach (requires sorted array)
        int st = 0;
        int en = arr.length - 1;

        while (st < en) {
            int sum = arr[st] + arr[en];
            if (sum == tar) {
                System.out.println("Pair found at indices: [" + st + ", " + en + "]");
                return new int[]{st, en};
            } else if (sum < tar) {
                st++; // need a larger sum, move left pointer right
            } else {
                en--; // need a smaller sum, move right pointer left
            }
        }

        System.out.println("No pair found");
        return new int[]{-1, -1};
    }
}
