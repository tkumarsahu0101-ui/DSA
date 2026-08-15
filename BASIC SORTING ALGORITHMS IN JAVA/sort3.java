// package BASIC SORTING ALGORITHMS IN JAVA;

public class sort3 {
    public static void main(String[] args){
        int arr[] = {3,4,6,2,1,8};
        insertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }
}
