public class setbits {

    public static void main(String[] args) {
        int no = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        int newNumbers = bitMask | no;

        System.out.println(newNumbers);

        if((bitMask | no)==0){

            System.out.println("bits is zero");
        }else{
            System.out.println("bits is one");
        }

    }
}