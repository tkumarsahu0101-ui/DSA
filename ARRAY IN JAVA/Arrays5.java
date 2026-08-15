import java.util.*;
public class Arrays5 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int num[] = new int[size];

    for(int i=0; i<size; i++){

        num[i] = sc.nextInt();

    }

    System.out.println("enter your x:");

    int x = sc.nextInt();

    for(int j=0; j<num.length; j++){

        if(num[j] == x){

            System.out.println("'x' found at index :" + j);
      

        }

    }

            
    }
}