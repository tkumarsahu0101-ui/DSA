public class recu3 {
    public static void main(String[] args) {
        int n = 5;
        int Sum_of_N_Natural_num = SumOFnNaturalNum(n);
        System.out.println(Sum_of_N_Natural_num);
    }
    public static int SumOFnNaturalNum(int n){
        if(n == 1){
            return 1;
        }
        int Sum_nm1 = SumOFnNaturalNum(n-1);
        int Sm = n + Sum_nm1;
        return Sm;
    }
}
