import java.util.Arrays;
public class prac6 {
    public static void main(String[] args) {
       int  nums[] = {-1, 0,  1, 2, -1, -4};
       ThreeSums(nums);
    }
    //Brute force approach
    public static void ThreeSum(int arr[]){
      for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length;  j++){
            for(int k = j+1; k<arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == 0 && i != j && j != k && k != i){
                    System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                }
            }
        }
      }
    }
    //Two Pointer approach

    public static void ThreeSums(int arr[]){

        Arrays.sort(arr);

        for(int i = 0; i<arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                   // ans found
                   System.out.println("["+arr[i]+","+arr[left]+","+arr[right]+"]");
                   left++;
                   right--;
                }else if(sum < 0){
                  left++;
                }else{
                    right--;
                }
            }
        }      
    }
}
