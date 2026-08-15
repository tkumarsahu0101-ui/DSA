public class recu1 {

    public static void main(String[] args) {
        int n = 10;
        Decreasing(n);
        Increasing(n);
    }
    // increasing order
    public static void Increasing(int n){
        if(n == 1){
            System.out.print(n+" ");
            
            return;
        }
        Increasing(n - 1);
        System.out.print(n+" ");
    }
    public static void Decreasing(int n){
        if(n == 1){
            System.out.print(n);
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        Decreasing(n - 1);
    }
}
