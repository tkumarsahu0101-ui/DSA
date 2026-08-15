public class arr6 {
    public static void main(String[] args) {
         int number[] = {2,4,6,8,10,12,14,15};
         reverse(number);
         System.out.print("Reverse Array is: ");
         for(int i = 0; i<number.length; i++){
            System.out.print(number[i]+" ");
         }
    }
    public static void reverse(int number[]){
       int first = 0; int last = number.length-1;

       while(first < last){
         /// swap 
         int temp = number[last];
         number[last] = number[first];
         number[first] = temp;
         first++;
         last--;
       }
    }
}
