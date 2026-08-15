public class arr5 {
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 45;
        // System.out.println("index for key is: "+ binarySearch(number, key));
        int index = binarySearch(number, key);
        if(index == -1){
            System.out.println("Element is not exist in Array!");
        }else{
            System.out.println("Element found at index:"+index);
        }
    }
    public static int binarySearch(int number[], int key){

      int start  = 0; int end = number.length - 1; 

      while(start <= end){
        int mid = (start + end)/2;
        
        // comparision 
        if(number[mid] == key){
            return mid;
        }
        if(number[mid] < key){ // right half
            start = mid + 1; 
        }else{ // left half
            end = mid - 1;
        }
      }
      return -1;
    }
}
