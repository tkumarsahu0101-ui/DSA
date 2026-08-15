public class arr8 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArray(arr);
    }
    public static void subArray(int arr[]){
        int ts = 0;
        // for(int i = 0; i<arr.length; i++){
        //     int start = i; 
        //     for(int j = i; j<arr.length; j++){
        //         int end = j;
        //         for(int k = start; k<=end; k++){
        //             System.out.print(arr[k]+" ");
                    
        //         }
        //         ts++;
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    
    for(int i = 0; i < arr.length; i++){
        
        for(int j = i; j < arr.length; j++){
            int sum = 0;
            for(int k = i; k <= j; k++){
              System.out.print(arr[k] + " ");
              sum = sum + arr[k];
        }
        System.out.println();
        System.out.println("sum of subarray "+i+" is "+sum);
        ts++;
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // if(max < sum){
        //     max = sum;
        // }
        // if(min > sum){
        //     min = sum;
        // }
        // System.out.println("max sum is"+ max);
        // System.out.println("min sum is"+ min);
    }
        System.out.println();
    }   
        System.out.println("Total subArray = "+ts);
    }
}






// This function prints all contiguous subarrays of the array and counts how many it printed.

// Suppose:

// int arr[] = {2, 4, 6, 8, 10};
// printSubArr(arr);
// Dry Run

// ts = 0

// For i = 0:

// j = 0 -> k = 0       -> 2        ts = 1
// j = 1 -> k = 0 to 1  -> 2 4      ts = 2
// j = 2 -> k = 0 to 2  -> 2 4 6    ts = 3
// j = 3 -> k = 0 to 3  -> 2 4 6 8  ts = 4
// j = 4 -> k = 0 to 4  -> 2 4 6 8 10 ts = 5

// For i = 1:
// j = 1 -> k = 1       -> 4        ts = 6
// j = 2 -> k = 1 to 2  -> 4 6      ts = 7
// j = 3 -> k = 1 to 3  -> 4 6 8    ts = 8
// j = 4 -> k = 1 to 4  -> 4 6 8 10 ts = 9

// For i = 2:
// j = 2 -> k = 2       -> 6        ts = 10
// j = 3 -> k = 2 to 3  -> 6 8      ts = 11
// j = 4 -> k = 2 to 4  -> 6 8 10   ts = 12

// For i = 3:
// j = 3 -> k = 3       -> 8        ts = 13
// j = 4 -> k = 3 to 4  -> 8 10     ts = 14
// For i = 4:

// j = 4 -> k = 4       -> 10       ts = 15
// Final Output

// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

// Total subArray: 15
// Here:

// i chooses the starting index of the subarray.
// j chooses the ending index of the subarray.
// k prints elements from index i to j.
// ts counts total subarrays.
// For an array of size n, total subarrays are:

// n * (n + 1) / 2
// For n = 5:

// 5 * 6 / 2 = 15
