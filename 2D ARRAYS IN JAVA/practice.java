import java.util.Scanner;

public class practice{
    public static void main(String [] args){
        // int arr[][] = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        // int arr[][] = {
        //     {4,7,8},
        //     {8,8,7}
        // };
        // int preq = frequency(arr, 7);
        // System.out.println(preq);
        //
        // int digonalSum = digonalSum(arr);
        // System.out.println(digonalSum);
        // stairCaseSearch(arr, 14);
        // spiralMatrix(arr);

        int arr[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        transPose(arr);
        // int sum = sec_ndRowSum(arr);
        // System.out.println(sum);
    }
    public static void spiralMatrix(int Matrix[][]){
        int startCol = 0; 
        int startRow = 0;
        int endRow = Matrix.length-1;
        int endCol = Matrix[0].length-1;
       while(startRow <= endRow && startCol <= endCol){
           // top
           for(int i = startCol; i<=endCol; i++){
            System.out.print(Matrix[startRow][i]+" ");
           }
           //right
           for(int i = startRow + 1; i<= endRow; i++){
            System.out.print(Matrix[i][endCol]+" ");
           }
           // bottom 
           for(int i = endCol - 1; i>= startCol; i--){
            if(startRow == endRow){
                break;
            }
            System.out.print(Matrix[endRow][i]+" ");
           }
           // left
           for(int i = endRow - 1; i>=startRow+1; i--){
            if(startCol == endCol){
                break;
            }
            System.out.print(Matrix[i][startCol]+" ");
           }
           startRow++;
           endRow--;
           startCol++;
           endCol--;
       }
       System.out.println();
    }
    public static int digonalSum(int Matrix[][]){

        int sum = 0; 
        // brut force Approach
        // for(int  i = 0; i<=Matrix.length-1; i++){
        //     for(int j = 0; j<=Matrix[0].length-1; j++){
        //         if(i == j){ //left digonal
        //             sum += Matrix[i][j];
        //         }else if(i+j == Matrix.length-1){//Right Digonal
        //             sum += Matrix[i][j];
        //         }
        //     }
        // }
        
        // linear sum approach , /time complexity => O(n);
        for(int i = 0; i<Matrix.length; i++){
            //pd
            sum += Matrix[i][i];
            //sd
            if(i != Matrix.length-i-1){
            sum += Matrix[i][Matrix.length-i-1];
            }
        }
        return sum;
    }
    public static boolean stairCaseSearch(int Matrix[][],int key){
        int row = 0; int col = Matrix[0].length-1;

        while (row < Matrix.length && col > 0){
            if(Matrix[row][col] == key){
                System.out.print("key found at index: "+"("+row+","+col+")");
                return true;
            }
            else if(key < Matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found...");
        return false;
    }
    public static int frequency(int arr[][],int key){
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static int sec_ndRowSum(int arr[][]){
     int sum = 0; 

    //     for(int i = 0; i<arr.length; i++){
    //         for(int j = 0; j<arr[0].length; j++){
    //             if(i == 1){
    //                 sum += arr[i][j];
    //             }
    //         }
        // }
        // return sum;
        int i = 1; 
        for(int j = 0; j<arr[0].length; j++){
           sum += arr[i][j];
        }
    return sum;
    }
    public static void transPose(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}