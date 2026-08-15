public class acendingstring {

    public static void main(String[] args) {
        
        String arr[] = {"amit", "sumit", "rahul", "zahid", "yash"};
        String temp;
        
        // number of round

        for(int i=0; i<arr.length; i++){
            //adjesent element
            int slag = 0; 
            for(int j=0;  j<arr.length-i-1; j++){
                //swap

                if(arr[j].compareTo(arr[j+1])>0){
                    
                temp = arr[j];

                arr[j] = arr[j+1];

                arr[j+1] = temp;
                 slag = 1;
                }

            }
            if(slag==0){

                break;
            }

            
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }
}