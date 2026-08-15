public class acendingstring1 {
            public static void printArrays(String arr[]){
                for(int i=0; i<arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }

    public static void main(String[] args) {

        String arr[] = {"amit", "sumit", "rahul", "zahid", "yash"};

        int min; 

        String temp = " ";

        for(int i=0; i<arr.length; i++){

            min = i; 

            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j].compareTo(arr[min]) > 0){

                    min  = j; 
                }

            }
            temp = arr[i];

            arr[i] = arr[min];

            arr[min] = temp;
        }
        for(int i = 0; i<arr.length; i++){

            System.out.println(arr[i] + " ");
        }

    }

}