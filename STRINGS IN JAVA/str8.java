public class str8 {
    public static void main(String[] args) {
        String str = "abcddd";
        System.out.println(compressString(str));
        
    }
    public static String compressString(String str){
        // String newStr = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            Integer count = 1; // Integer kyoki bad me jake integer ko String me converd karte
            
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            // newStr += str.charAt(i);
            sb.append(str.charAt(i));
            if(count > 1){
                // newStr += count.toString();
                sb.append(count.toString());
            }
        }
        // return newStr;
        return sb.toString();
    }
}
