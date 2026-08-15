

public class arr3  {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int totalTrappedWater = trappedRainWater2(height); 
        System.out.println("Total trapped water is: "+totalTrappedWater+" L");
    }
    //// Brut force approach
    public static int  trappedRainWater1(int height[]){ // Time complexity O(n)
       int n = height.length;
       // calculate left max boundory - in th""e form of Array
       int leftMax[] = new int[n];
       leftMax[0] = height[0];
       for(int i = 1; i<n; i++){
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
       }
       // / calculate right max boundory - in the form of Array
       int rightMax[] = new int[n];
       rightMax[n-1] = height[n-1];
       for(int i = n - 2; i>=0; i--){
       rightMax[i] = Math.max(height[i],rightMax[i + 1]);
       }
       int trappedWater = 0;
       // loop run
       for(int i = 0; i<n; i++){
        //water label = min(left maxbound ,right max bound)
       int waterLavel = Math.min(leftMax[i], rightMax[i]);

       int tw = waterLavel - height[i];
       
       // trapped water = waterLable - height[i];
       trappedWater += tw;
       }
       return trappedWater;
    }

    /// Two pointer approach
    public static int trappedRainWater2(int height[]){
        int n = height.length;
        int left = 0 , right = n-1;
        int leftMax = 0 , rightMax = 0;
        int tp = 0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    tp += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    tp += rightMax - height[right];
                }
                right--;
            }
        }
        return tp;
    }
}



