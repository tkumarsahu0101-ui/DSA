public class secondlargest2 {

    public static void main(String[] args) {
        
        int arr[] = {6,8,2,4,3,1,5,7,9};

        int largest = Integer.MIN_VALUE;

        int sec_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
            }else if(arr[i] > sec_largest && arr[i] != largest){
                sec_largest = arr[i];
            }
        }
        if(sec_largest == Integer.MIN_VALUE){

            System.out.println("there is no second largest element in the list");
        }else{
            System.out.println("second largest element is :"+ sec_largest);
        }
    }
}