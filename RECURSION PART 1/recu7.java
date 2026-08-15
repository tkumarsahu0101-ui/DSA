public class recu7 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,6};
        int lastOccurence = LastOccurence(arr, 6, 0);
        System.out.println(lastOccurence);
    }
    public static int LastOccurence(int arr[], int key, int i){
          if(i == arr.length){
            return -1;
          }
          int isfound = LastOccurence(arr, key, i+1);

          if(isfound == -1 && arr[i] == key){
            return i;
          }
          
          return isfound;

    }
}
