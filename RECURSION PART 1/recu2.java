public class recu2 {
    public static void main(String[] args) {
        int n = 5;
        int factorial = Fact(n);
        System.out.println(factorial);

    }
    public static int Fact(int n){
      if(n == 0){
        return 1;
      }
      int fact_nm1 = Fact(n-1);
      int fact_n = n *fact_nm1;
      return fact_n;
    }

} 
