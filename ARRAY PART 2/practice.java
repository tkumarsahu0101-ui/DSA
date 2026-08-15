
public class practice {

    public static void main(String[] args) {
        // prefix sum 
        int arr[] = {1,-2,6,-1,3};
        int ms = maxSubArraySum(arr);
        System.out.println(ms);
        
        // int arr[] = {4,2,0,6,3,2,5};
        // int tw = trappingWater(arr);
        // System.out.println(tw);

        ///buy sell stocks 
        // int prices[] = {7,1,5,3,6,4};
        // System.out.println(buySell(prices));

        // Duplicate in array

        // int arr[] = {2,3,4,5,8};
        // if(isDuplicate(arr) == true){
        //     System.out.println("duplicate available in array");
        // }else{
        //     System.out.println("duplicate not exist in array");
        // }
    }
    public static int trappedWater(int height[]){

        int n = height.length;

        // left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        
        for(int i = 0; i<n; i++){

            int waterlevel = Math.min(leftMax[i] , rightMax[i]);

            trappedWater += waterlevel - height[i];
        }
        return  trappedWater;
    }


    public static int buySellStocks(int prices[]){
         int buyPrice = Integer.MAX_VALUE;
         int maxProfit = 0;

         for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrice = prices[i];
            }
         }
         return maxProfit;
    }
    // public static boolean isDuplicates(int arr[]){

    //     for(int i = 0; i<arr.length; i++){
    //         for(int j = i + 1; j<arr.length; j++){
    //             if(arr[i] == arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static int maxSubArraySum(int arr[]){
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(i == 0){
                    cs = prefix[j];
                }else{
                    cs = prefix[j] - prefix[i-1];
                }
                if(maxSum < cs ){
                    maxSum = cs;
                }
            }
        }
        return maxSum;
    }

public static int trappingWater(int height[]){
    int n = height.length;

    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1; i<n; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
    }
   
    int tp = 0; 

    for(int i = 0; i<n; i++){
        int WL = Math.min(leftMax[i], rightMax[i]);
        tp += WL - height[i];
    }
    return tp;
}

public static int buySell(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0; 

    for(int i = 0; i<prices.length; i++){
        if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }else{
            buyPrice = prices[i];
        }
    }
    return maxProfit;
    }
    public static int Kadans(int arr[]){
        int cs =  arr[0];
        int ms = arr[0];

        for(int i = 1; i<arr.length; i++){
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static boolean isDuplicate(int arr[]){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
 
    

