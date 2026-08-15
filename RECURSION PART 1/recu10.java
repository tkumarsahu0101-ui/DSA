// remove dubplicate character in string
public class recu10 {

    public static void main(String[] args) {
        String str = "appnnacollege";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    public static void removeDuplicates(String str,int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }
        //work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {//Matlab ye character pehle aa chuka hai
            // duplicate
            
            removeDuplicates(str, idx+1, newStr, map);// skip karo
        }else{
            //Case 2: Naya character
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
}
