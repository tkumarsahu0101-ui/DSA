import java.util.*;

public class inputoutput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter row size :");

        int rows = sc.nextInt();

        System.out.println("Enter cols size :");

        int cols = sc.nextInt();

        System.out.println("Enter matrix :");

        int[][] numbers = new int[rows][cols];

        //input

         //rows

        for(int i=0; i<rows; i++) {

         //columns
            for(int j=0; j<cols; j++) {

                numbers[i][j] = sc.nextInt();

            }

        }

        System.out.println("Enter no x :");

        int x = sc.nextInt();

        for(int i=0; i<rows; i++) {

            for(int j=0; j<cols; j++) {

                if(numbers[i][j] == x){

                     System.out.print("x found at location ("+i+" , "+j+")");

                }
            }
            System.out.println();
        }
    }
}
