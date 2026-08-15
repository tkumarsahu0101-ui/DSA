public class prac1 {

    public static void main(String[] args) {
       int arr[] = {2,6,1,3};
       System.out.println(duplicate(arr));
       
    }
    public static void Twice(int arr[]){
          for(int i = 0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int k = 0; k < i; k++){
                if(i != k && arr[i] == arr[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                continue;
            }
            for(int j = i+1; j<arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
          }
    }
    public static boolean duplicate(int arr[]){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


