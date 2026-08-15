public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {5,8,12,7,6,2,4};
        int k=2;
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(k +" largest element is:" + arr[i]);
            }
        }
        System.out.println("___________");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
