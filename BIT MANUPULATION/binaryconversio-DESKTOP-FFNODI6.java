public class binaryconversio{

    public static void main(String[] args) {
        
        int n = 3;

        int count = 0; 


        while(n>0){

            count += n&1;

            n>>=1;

        }

        System.out.println("Number of 1 in binary representation :"+count);

        System.out.println("_______________________________________________");

        System.out.println(( 5 & 6));
        System.out.println(0 | 1);
        System.out.println(6 | 5);
        System.out.println(6 ^ 5);
        System.out.println(~5);
        System.out.println(~0); // => -1
        System.out.println(5<<2);
        System.out.println(6>>1);

    }
}



