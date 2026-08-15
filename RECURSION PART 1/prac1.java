
public class prac1 {

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        findOcurrence(arr, key, 0);
        
    }
    public static void findOcurrence(int arr[],int key, int i){
          if(i == arr.length){
            System.out.println();
            return;
          }
           
          if(arr[i] == key){
             System.out.println(i+" ");
          }
          findOcurrence(arr, key, i+1);
    }

}