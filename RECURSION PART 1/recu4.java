public class recu4 {
    public static void main(String[] args) {
        System.out.println(Fib(21));
        System.out.println(Fib(22));
        System.out.println(Fib(23));
        System.out.println(Fib(24));
        System.out.println(Fib(25));
        System.out.println(Fib(26));
    }
    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n; 
        }
        int f_nm1 = Fib(n-1);
        int f_nm2 = Fib(n-2);
        int f_N = f_nm1 + f_nm2;
        return f_N;
    }
}
