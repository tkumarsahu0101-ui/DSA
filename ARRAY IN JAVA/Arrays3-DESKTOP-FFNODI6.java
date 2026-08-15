import java.util.*;
public class Arrays3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int number[][] = new int[row][col];


        // input 
        for(int i = 0; i<number.length; i++){
            for(int j = 0 ; j<number.length; j++){
                number[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i = 0; i<number.length; i++){
            for(int j = 0; j<number[i].length; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }



    }

}

