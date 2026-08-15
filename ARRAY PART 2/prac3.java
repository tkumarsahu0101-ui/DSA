//Rotated sorted Array
public class prac3 {
    public static void main(String[] args) {
         int arr[] = {4,5,6,7,0,1,2};
         int target = 0;
         int ans = rotate(arr, target);
         System.out.println("Target "+target+" found at index: "+ans); 
    }
    public static int rotate(int arr[] , int tar){
        int st = 0; int en = arr.length - 1;

        while (st <= en) {
            int mid = st + (en - st)/2;

            if(arr[mid] == tar){
                return mid;
            }
            if(arr[st] <= arr[mid]){
                if(tar >= arr[st]  && tar <= arr[mid]){
                    en = mid - 1; 
                }else{
                    st = mid + 1;
                }
            }else{
                if(arr[mid] <= tar && arr[en] >= tar){
                    st = mid + 1; 
                }else{
                    en = mid - 1;
                }
            }
        }
        return -1;
    }
}
