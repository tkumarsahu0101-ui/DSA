import java.util.*;

public class b {

    public static void main(String[] args) {
        
        int arr [] = new int[5];

        arr[0] = 2;

        arr[1] = 4;

        arr[2] = -3;

        arr[3] = -6;

        int res = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            if(arr[i]>res){

                res = arr[i];

            }
            
        }

        System.out.println(res);

    }
}