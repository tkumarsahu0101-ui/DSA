import java.util.*;

public class twosum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); 

        int nums[] = new int[size];
                
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        int target = 17;
        for(int i=0; i<nums.length; i++) {
            
        for(int j=i+1; j<nums.length; j++ ){
            if(nums[i]+nums[j] == target){
                System.out.println("Index is: "+i+""+j); 
            }
            }
        }

    }
}
