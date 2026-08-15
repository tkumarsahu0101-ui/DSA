public class binaryconversio{

    public static void main(String[] args) {
        
        int n = 3;

        int count = 0; 


        while(n>0){

            count += n&1;

            n>>=1;

        }

        System.out.println("Number of 1 in binary representation :"+count);
    }
}



