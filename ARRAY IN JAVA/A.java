import java.util.*;

public class A {

    public static void main(String[] args) {
             
        int arr[] = {2,4,55,11,-4,-11,-55,-2};

        int sum = 0;

        for (int  i : arr) {

            sum += i;
        }
        System.out.println(sum);
    }
}