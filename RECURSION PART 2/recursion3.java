public class recursion3 {

    public static int first = -1;

    public static int last = -1;

    public static void findOccurance(String str , int idx, char elements){

        if(idx == str.length()){

            System.out.println(first);

            System.out.println(last);

            return;
        }
        char currChar = str.charAt(idx);

        if(currChar==elements){

            if(first == -1){

                first = idx;
            }else{

                last = idx;
            }
        }
        findOccurance(str, idx+1, elements);
    }

    public static void main(String[] args) {
        
        String str = "abaecdaefaah";

        findOccurance(str, 0, 'e');

    }
    
}
