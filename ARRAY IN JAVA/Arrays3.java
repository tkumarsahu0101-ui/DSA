import java.util.*;
public class Arrays3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input 

        for(int i=1; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // output

        for(int i=1; i<numbers.length; i++){

            System.out.println(numbers[i]);

        }
    }

}

