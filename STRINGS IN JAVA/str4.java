public class str4 {
    public static void main(String[] args) {

        //subString
        String str = "helloworld";
        // System.out.println(substring(str, 0, 5));

        String subStrings = str.substring(5,7);
        System.out.println(subStrings);
    }
    public static String substring(String str, int si, int ei ){
        String substr = " ";
        for(int i = si; i<ei; i++){
           substr += str.charAt(i);
        }
        return substr;
    }
}
