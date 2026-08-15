public class recu8{

    public static void main(String[] args){
          int x = 2;
          int n = 7;
        //   System.out.println(power(x, n));
          System.out.println(calPower(x, n));
    }
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xmn1 = power(x , n-1);
        int xn = x * xmn1;
        return xn;
         // Another Syntax->
        // return x * power(x, n-1);
    }
    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2 == 0){
            return calPower(x, n/2)*calPower(x, n/2);
        }else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }
}