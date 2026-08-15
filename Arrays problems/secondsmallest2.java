public class secondsmallest2 {

    public static void main(String[] args) {
        
        int arr[] = {6,8,2,4,3,1,5,7,9};

        int smallest = Integer.MAX_VALUE;

        int sec_smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < sec_smallest && arr[i] != smallest){
                sec_smallest = arr[i];
            }
        }
        if(sec_smallest == Integer.MAX_VALUE){

            System.out.println("there is no second smallest element in the list");
        }else{
            System.out.println("second smallest element is :"+ sec_smallest);
        }
    }
}