public class prac2 {
    public static void main(String[] args) {
        String str = "trilok";
        System.out.println(strLength(str, 0));

    }
    public static int  strLength(String str , int i){
         if(i == str.length()){
            return 0;
         }
          int count = 1;
         return count + strLength(str, i + 1);
    }
}
