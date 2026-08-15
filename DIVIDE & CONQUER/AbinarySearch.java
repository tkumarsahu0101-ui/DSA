public class AbinarySearch {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 7;
        int tarIdx = BinarySearch(arr,key,0,arr.length-1);
        System.out.println(tarIdx);
    }
    public static int BinarySearch(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si)/2;

        // case found

        if(arr[mid] == key){
            return mid;
        }
        
        // if mid on L1
        if(arr[si] <= arr[mid]){

            // case a: Left search
            if(arr[si] <= key && key <= arr[mid]){
                return BinarySearch(arr, key, si, mid-1);
            }else{
                // case b:right search
                return BinarySearch(arr, key, mid + 1, ei);
            }

        }else{// if mid on L2

            // case c: right
            if(arr[mid] <= key && key <= arr[ei]){
                return BinarySearch(arr, key, mid + 1, ei);
            }else{
                //case d: search left
                return BinarySearch(arr, key, si, mid - 1);
            }
        }
    }
}
