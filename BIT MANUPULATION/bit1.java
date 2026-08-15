public class bit1 {
    public static void main(String[] args) {
        OddOreven(5);
        OddOreven(8);
        OddOreven(7);
        OddOreven(4);
    }
    public static void OddOreven(int n){
       int bitsMask = 1;
       if((n & bitsMask) == 0){
        System.out.println("even number");
       }else{
        System.out.println("odd number");
       }
    }
}
