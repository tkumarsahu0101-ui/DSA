import java.util.*;
public class Arrays1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int rows = sc.nextInt();
     int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        for(int i=0; i<arr.length; i++){
          
          for(int j=0; j<arr[i].length; j++){
            arr[i][j] = sc.nextInt();
            
            System.out.println(arr[i][j] +" ");

          }
        }
    }
}