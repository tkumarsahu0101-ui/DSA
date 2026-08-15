import java.util.*;
public class Arrays1 {

    public static void main(String[] args) {
              int []marks = {45,46,47};
      for(int i=0; i<3; i++){
        System.out.println(marks[i]);

      }

      Scanner sc = new Scanner(System.in);

     int rows = sc.nextInt();

     int cols = sc.nextInt();


      
        int [][] arr = new int[rows][cols];

        for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[i].length; j++){

            
            System.out.println(arr[i][j]);

          }
        }
    }
}