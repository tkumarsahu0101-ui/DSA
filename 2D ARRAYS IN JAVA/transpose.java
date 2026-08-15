import java.util.*;

public class transpose {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter rows size :");

        int n = sc.nextInt();

        System.out.println("Enter cols size :");

        int m = sc.nextInt();

        System.out.println("Enter matrix :");

        int[][] numbers = new int[n][m];

        // input

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                numbers[i][j] = sc.nextInt();

            }
        }
        System.out.println("Transpose matrix is: ");
        //output

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                System.out.print( numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
}