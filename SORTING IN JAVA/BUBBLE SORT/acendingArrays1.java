public class acendingArrays1 {

    public static void main(String[] args) {
        
        int arr[] = {36,19,23,12,5};
        int temp;
        for(int i=0 ;  i<arr.length; i++){
           int slag = 0 ;
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }  
                      slag = 1;
            }
            if(slag == 0){
                break;
            }
        }
        for(int i=0 ;  i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

}