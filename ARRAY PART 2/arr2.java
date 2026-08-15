
public class arr2 {
    public static void main(String[] args) {
        // int arr[] = {1,-2,6,-1,3};
        // printMaxSubArrSum(arr);

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadanes3(arr);
    }
    public static void kadanes1(int arr[]){
        
       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;

       int start = 0;
       int end = 0;
       int tempStart = 0;


       for(int i = 0; i<arr.length; i++){
        currSum = currSum + arr[i];

        // update max sum
        if(currSum > maxSum){
            maxSum = currSum;
            start = tempStart;
            end = i;
        }
        // reset if negative
        if(currSum < 0){
            currSum = 0;
            tempStart = i+1;
        }
        // maxSum = Math.max(maxSum, currSum);
       }

       System.out.println("max subArray sum is:"+ maxSum);
       System.out.print("max sum Sub array:");
       System.err.print(" ");
       for(int i = start; i<=end; i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void kadanes2(int arr[]){
        int ms = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cs = 0;

        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];

            if( cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sub array sum is: "+ ms);
    }
public static void kadanes3(int arr[]) {
    int ms = arr[0];
    int cs = arr[0];
    for (int i = 1; i < arr.length; i++) {
        cs = Math.max(arr[i] , cs + arr[i]);
        ms = Math.max(ms, cs);
    }
    System.out.println("max sub array sum is: " + ms);
}
    public static void printMaxSubArrSum(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // prefix array calculate

        for(int i = 1; i<prefix.length; i++){

            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
           for(int j = i; j<arr.length; j++){

            currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

            if(maxSum < currSum){
                maxSum = currSum;
            }
           }
        }
        System.out.println("Maximum sum = "+maxSum);
    } 
}

// dry run of code
// | i | arr[i] | currSum   | maxSum | tempStart | start | end |
// | - | ------ | --------- | ------ | --------- | ----- | --- |
// | 0 | -2     | -2        | -2     | 0         | 0     | 0   |
// |   |        | reset → 0 |        | 1         |       |     |
// | 1 | 1      | 1         | 1      | 1         | 1     | 1   |
// | 2 | -3     | -2        | 1      | 1         | 1     | 1   |
// |   |        | reset → 0 |        | 3         |       |     |
// | 3 | 4      | 4         | 4      | 3         | 3     | 3   |
// | 4 | -1     | 3         | 4      | 3         | 3     | 3   |
// | 5 | 2      | 5         | 5      | 3         | 3     | 5   |
// | 6 | 1      | 6         | 6      | 3         | 3     | 6   |
// | 7 | -5     | 1         | 6      | 3         | 3     | 6   |
// | 8 | 4      | 5         | 6      | 3         | 3     | 6   |


// kandans algorithms

// | Index (i) | arr[i] | cs = max(arr[i], cs + arr[i]) | ms = max(ms, cs) | Explanation |
// | --- | --- | --- | --- | --- |
// | 0 | 1 | 1 | 1 | Start with first element |
// | 1 | -2 | max(-2, 1+(-2)) = -1 | max(1, -1) = 1 | Negative value reduces sum |
// | 2 | 6 | max(6, -1+6) = 6 | max(1, 6) = 6 | New subarray starting at 6 is better |
// | 3 | -1 | max(-1, 6+(-1)) = 5 | max(6, 5) = 6 | Slight drop but continue subarray |
// | 4 | 3 | max(3, 5+3) = 8 | max(6, 8) = 8 | Sum increases further |


// dry run of prefix sub array sum 

            // currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1];

            // if(maxSum < currSum){
            //     maxSum = currSum;
            // }

// prefix[i] = prefix[i - 1] + arr[i];
// prefix[0] = arr[0] = 1
// prefix[1] = prefix[0] + arr[1] = 1 + (-2) = -1
// prefix[2] = prefix[1] + arr[2] = -1 + 6 = 5
// prefix[3] = prefix[2] + arr[3] = 5 + (-1) = 4
// prefix[4] = prefix[3] + arr[4] = 4 + 3 = 7


// i = 0

// j=0 → currSum = prefix[0] = 1 → maxSum = 1

// j=1 → currSum = prefix[1] = -1 → maxSum = 1

// j=2 → currSum = prefix[2] = 5 → maxSum = 5

// j=3 → currSum = prefix[3] = 4 → maxSum = 5

// j=4 → currSum = prefix[4] = 7 → maxSum = 7

// i = 1

// j=1 → currSum = prefix[1] - prefix[0] = -1 - 1 = -2 → maxSum = 7

// j=2 → currSum = prefix[2] - prefix[0] = 5 - 1 = 4 → maxSum = 7

// j=3 → currSum = prefix[3] - prefix[0] = 4 - 1 = 3 → maxSum = 7

// j=4 → currSum = prefix[4] - prefix[0] = 7 - 1 = 6 → maxSum = 7

// i = 2

// j=2 → currSum = prefix[2] - prefix[1] = 5 - (-1) = 6 → maxSum = 7

// j=3 → currSum = prefix[3] - prefix[1] = 4 - (-1) = 5 → maxSum = 7

// j=4 → currSum = prefix[4] - prefix[1] = 7 - (-1) = 8 → maxSum = 8

// i = 3

// j=3 → currSum = prefix[3] - prefix[2] = 4 - 5 = -1 → maxSum = 8

// j=4 → currSum = prefix[4] - prefix[2] = 7 - 5 = 2 → maxSum = 8

// i = 4

// j=4 → currSum = prefix[4] - prefix[3] = 7 - 4 = 3 → maxSum = 8