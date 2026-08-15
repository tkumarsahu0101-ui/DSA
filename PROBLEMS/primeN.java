import java.util.*;

public class primeN {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    boolean isprime = true;

    for(int n=2; n<=N; n++){

        for(int i=2;i*i<=n; i++){
            if(n%i == 0){
             isprime = false;
             break;
            }
         }
    if(isprime){
    System.out.println(n+" "+"is prime number");
    }else{
        System.out.println(n+" "+"is not prime number");
    }
    }

}
}