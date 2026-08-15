import java.util.HashSet;

public class prac2 {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,2};
        Twice(arr);
    }
    // Approach 1 - Brute Force (O(n^2))
    public static boolean Twice(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // Approach 2 - HashSet (O(n))
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int i=0; i<nums.length; i++) { 
            if(set.contains(nums[i])) { 
                return true;
             } else {
                 set.add(nums[i]); 
                } 
            }
             return false; 
        }
}
