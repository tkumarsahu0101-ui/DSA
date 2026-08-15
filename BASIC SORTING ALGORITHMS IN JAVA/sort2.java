// package BASIC SORTING ALGORITHMS IN JAVA;

public class sort2 {
    public static void main(String[] args){
        int arr[] = {3,4,6,2,1,8};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length - 1; i++){
            int minPos = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    } 
}
