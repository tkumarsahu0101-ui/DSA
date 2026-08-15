public class conversionbits {

    public static String decimaltoBinary(int n){

        return Integer.toBinaryString(n);

    }
    public static int binarytodecimal(String binarystr){

        return Integer.parseInt(binarystr,2);
    }

    public static void main(String[] args) {

        int decimal = 13;

        String binary = "1101";

        System.out.println("decimal to binary of"+decimal+"is:"+decimaltoBinary(decimal));

        System.out.println("Binary to decimal"+binary+"is"+binarytodecimal(binary));
        
    }
}