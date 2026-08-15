public class recu6 {
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,7,8,9};
        int first_Occurence = firstOccurence(arr, 8, 0);
        System.out.println(first_Occurence);
    }
    public static int firstOccurence(int arr[],int key,int i){

        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
}
