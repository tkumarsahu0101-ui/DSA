import java.util.*;

public class prac{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        boolean isAcending = true;

        int num[] = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        

        for(int i=0; i<num.length-1; i++){

            if(num[i] > num[i+1]){
               isAcending = false;
            }

        }
        if(isAcending){
            System.out.println("array is shorted in acending order");
        }else{
            System.out.println("array is not shorted acending order");
        }


    }
}
