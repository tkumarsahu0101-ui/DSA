public class acendingnum {

    public static void main(String[] args) {
        int arr[] = {38,52,9,18,6,62,52,62};
        int min ,temp = 0;
        for(int i=0; i<arr.length; i++){
            min = i; 

            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[min]){
                    min = j;
                }
            }
            temp = arr[i];

            arr[i] = arr[min];

            arr[min] = temp;

        }
        for(int i=0; i<arr.length; i++){
            
        System.out.println(arr[i] + " ");
        }

    }
}