public class arr10 {
    public static void main(String[] args) {
    String name[] = {"Trilok","Chanchal","Vikash","Lucky","Aditya"};
    reverseStr(name);
    for(int i = 0; i<name.length; i++){
        System.out.print(name[i]+" ");
    }
    }
    public static void reverseStr(String name[]){
        int start = 0; int last = name.length-1;

        while(start < last){
            String temp = name[last];
            name[last] = name[start];
            name[start] = temp;
            start++;
            last--;
        }
    }
}
