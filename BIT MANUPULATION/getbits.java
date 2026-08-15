public class getbits{

    public static void main(String[] args) {
        
        int no = 4; 

        int pos = 3;

        int bitMask = 1 << pos;

        int  newNumbers = bitMask & no;

        System.out.println(newNumbers);

        if((bitMask & no)==0){

            System.out.println("bits was zero");
        }else{
            System.out.println("bits was one");
        }
    }
}
