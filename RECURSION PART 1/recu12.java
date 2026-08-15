public class recu12 {
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
    public static void printBinaryStrings(int n,int lastplace , String str){
        // base case 
        if(n == 0){
            System.out.println(str);
            return;
        }
        // if(lastplace == 0){
        //     // sit 0 on chair n
        //     printBinaryStrings(n-1, 0, str.append("0"));
        //     printBinaryStrings(n-2, 1, str.append("1"));
        // }else{
        //     printBinaryStrings(n-1, 1, str.append("0"));
        // }

        printBinaryStrings(n-1, 0, str+"0");
        if(lastplace == 0){
          printBinaryStrings(n-1, 1, str+"1");
        }
    }
}
