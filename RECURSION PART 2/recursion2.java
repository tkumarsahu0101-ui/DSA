public class recursion2 {

    public static void main(String[] args) {

        String str = "abcd";

        printRevers(str, str.length()-1);

        System.out.println( "Length of String :"+ str.length());
        
    }

    public static void printRevers(String str , int idx){

        if(idx==0){

            System.out.println(str.charAt(idx));


            return;

        }

        System.out.println(str.charAt(idx));

        printRevers(str, idx-1);

        
    }
}