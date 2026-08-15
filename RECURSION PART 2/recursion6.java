public class recursion6 {

    public static void main(String[] args) {

        String str = "abbccda";

        removeDuplicats(str, 0, " ");
        

    }

    public static boolean []map = new boolean[26];

    public  static void removeDuplicats(String str,int idx,String newString ){

        if(idx ==str.length()){

            System.out.println(newString);

            return;

        }
        char currChar = str.charAt(idx);

        if(map[currChar - 'a']){

            removeDuplicats(str, idx+1, newString);
        }else{

            newString += currChar;

            map[currChar - 'a'] = true;

            removeDuplicats(str, idx+1, newString);
        }
    }
    


    
}