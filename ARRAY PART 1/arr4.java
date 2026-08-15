public class arr4 {
    public static void main(String [] args){
       int number[] = {2,5,8,4,6,9};
       System.out.println("Largest number is :"+ getLargest(number));
    }
    public static int getLargest(int number[]){
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
         for(int i = 0; i<number.length; i++){
            // if(largest < number[i]){
            //     largest = number[i];
            // }
            // if(smallest > number[i]){
            //     smallest = number[i];
            // }
            largest = Math.max(largest, number[i]);
            smallest = Math.min(smallest, number[i]);
         }
         System.out.println("Smallest value is :"+smallest);
         return largest;
    }
}
