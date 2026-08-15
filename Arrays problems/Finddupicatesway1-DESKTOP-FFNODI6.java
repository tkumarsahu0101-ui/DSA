public class Finddupicatesway1 {//yah method ek hi elements ke two se jyada smae element hone par sabhi same elements ko print kar deta hai
    // there for brute fource methode sufficient nahi hai
    public static void main(String[] args) {
        int arr[] = {3,4,5,3,2,2,1};
        System.out.println("duplicate elements are :");
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && (i !=j)){
                    System.out.println(arr[j]+" ");
                }
            }
            
        }
    }
}
