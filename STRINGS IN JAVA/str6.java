public class str6 {

    public static void main(String[] args) {
        // String builder 

        StringBuilder sb = new StringBuilder("");
        //  System.out.println(sb.toString());

        for(char ch = 'a'; ch<='z'; ch++){
             sb.append(ch);
        }

        // TC => O(26) Becouse loop is run 26 time
        // if we do str += ch then loop is run (26*n) => n^2;
        System.out.println(sb);
        System.out.println(sb.length());

    }

}