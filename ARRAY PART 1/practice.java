public class practice{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        printSubArraySum(arr);
       
        

        
        

    //     for(int i = 0; i<arr.length; i++){
    //         System.out.println(arr[i]+" ");
    //     }
    // }
//     public static void reverseArr(int arr[]){
        
//         int si = 0; int ei = arr.length-1;

//         while(si < ei){
//           int temp = arr[ei];
//           arr[ei] = arr[si];
//           arr[si] = temp;

//           si++;
//           ei--;
//         } 
 }
    // public static void pairArr(int arr[]){
    //     int tp = 0; 
    //     for(int i = 0; i<arr.length; i++){
    //         int curr = arr[i];
    //         for(int j = i+1; j<arr.length; j++){
    //             System.out.print("("+curr+","+arr[j]+")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(tp);
    // }
//     public static void printSubArr(int arr[]){
//         int ts = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i; j<arr.length; j++){
//                 int sum = 0;
//                 for(int k = i; k<=j; k++ ){
//                     System.out.print(arr[k] + " ");
//                     sum += arr[k];
//                 }
//                 ts++;
//                 System.out.println("sub array sum is: "+sum);
//                 System.out.println();
//                 if(max < sum){
//                     max = sum;
//                 }
//             }
//             System.out.println();
            
//         }
//         System.out.println("Total subArray: "+ts);
//         System.out.println("max sub array sum is: "+ max);
//     }
public static void printSubArraySum(int arr[]){
    int max = Integer.MIN_VALUE;
    int ts = 0;
    for(int i=0; i<arr.length; i++){
        for(int j = i; j<arr.length; j++){
            int sum = 0; 
            for(int k = i; k<=j; k++){
                System.out.print(arr[k]+" ");
                sum += arr[k];
            }
            ts++;
            System.out.println(j+"th sub Array sum = "+ sum);
            System.out.println();
            if(max < sum){
                max = sum;
            }

        }
        System.out.println();
    }
    System.out.println("Total sub Array: "+ts);
    System.out.println("Max sub Array sum is: "+ max);
}

}




