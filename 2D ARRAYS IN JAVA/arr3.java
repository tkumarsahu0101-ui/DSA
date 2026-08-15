public class arr3 {
    public static void main(String[] args) {
           int Matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
           };
           System.out.println("diagonal sum is: "+diagonalSum(Matrix));
    }
    
    public static int diagonalSum(int Matrix[][]){
          int sum = 0; 

        //   for(int i = 0; i<Matrix.length; i++){
        //     for(int j = 0; j<Matrix[0].length; j++){
        //         // left diagonal
        //         if(i == j){
        //             sum += Matrix[i][j];
        //         }
        //         //right diagonal
        //         if((i + j == Matrix.length-1)){
        //             sum += Matrix[i][j];                
        //         }
        //     }
        //   }

        // for linear complexity => time complexity is: O(n^2)

        for(int i = 0; i<Matrix.length; i++){
            //PD
            sum += Matrix[i][i];
            //SD
            if(i != Matrix.length - i - i){
                sum += Matrix[i][Matrix.length - i - 1];
            }
        }
          return sum;
    }
}
