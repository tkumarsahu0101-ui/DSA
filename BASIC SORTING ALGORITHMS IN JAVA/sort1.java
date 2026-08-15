// Bubble Sort Algorithm in Java
public class sort1 {
    public static void main(String[] args){
                 int arr[] = {2,2,8,9,6,3};
                 bubbleSort(arr);
                 printArr(arr);
    }
    // public static void bubbleSort(int arr[]){
    //     for(int i = 0; i< arr.length - 1; i++){
    //         int swap = 0;
    //         for(int j = 0; j<arr.length - i - 1; j++){
    //             if(arr[j] > arr[j+1]){
    //             // swap 
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;
    //             swap++;
    //             }
    //         }
    //     } 
    // }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    /// ek sorted array ke liye bubble sort ka optimize approach ||| Time complexity => O(n)
    public static void bubbleSort(int arr[]){
        for(int i = 0; i< arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                // swap 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
                }
            }
            // Agar koi swap nahi hua to array sorted hai
            if (!swapped) {
                System.out.println("Array already sorted hai.");
                break;
            }
        } 
    }
}
