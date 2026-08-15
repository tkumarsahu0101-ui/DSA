public class arr5 {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Kadans(arr);
    }
    public static void Kadans(int arr[]){
        int currSum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            currSum = currSum + arr[i];
            
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
