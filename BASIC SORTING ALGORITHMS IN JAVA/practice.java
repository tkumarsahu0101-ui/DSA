public class practice {
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,7,4};
        // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
    public static void bubbleSort(int arr[]){
        
        for(int i = 0; i<arr.length - 1; i++){
            boolean isSwapped = false;
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                System.out.println("array is already sorted");
                break;
            }
            
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int arr[]){

    //  for(int i = 0; i<arr.length - 1; i++){
    //     int minPos = i;
    //     for(int j = i+1; j<arr.length; j++){
    //         if(arr[minPos] > arr[j]){
    //             minPos = j;
    //         }
    //     }
    //     // swapping
    //     int temp = arr[i];
    //     arr[i] = arr[minPos];
    //     arr[minPos] = temp; 
    //  }
    for(int i = 0; i<arr.length-1; i++){
        int minPos = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minPos] > arr[j]){
                minPos = j;
            }
        }
        /// swapping 
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
    }
}
