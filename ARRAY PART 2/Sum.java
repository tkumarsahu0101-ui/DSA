import java.util.Arrays;
public class Sum {
    public static void main(String[] args){
        int nums[] = {-1,0,1,2,-1,-4};
        // threeSumTwoPointer(nums);
        threeSum(nums);
    }
    //  Brute force approach
    public static void threeSum(int nums[]){
        // Time complexity: O(n^3);
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                for(int k = j + 1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                    }
                }
            }
        }
    }
    // Two pointer approach
    public static void threeSumTwoPointer(int nums[]){
        // Time complexity: O(n^2);
        Arrays.sort(nums);
        for(int i = 0; i<nums.length - 2; i++){
            // skip duplicate elements
            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j  = i + 1; 
            int k = nums.length - 1; 

             while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);

                    j++;
                    k--;

                    // skip duplicates
                    while(j < k && nums[j] == nums[j-1]){
                       j++;
                    } 
                    while(j < k && nums[k] == nums[k+1]){
                       k--;
                    }
                    
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
}
