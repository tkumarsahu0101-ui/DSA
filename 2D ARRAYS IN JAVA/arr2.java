public class arr2 {

    public static void main(String[] args) {
        
        int Matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(Matrix);
    }
    public static void printSpiral(int Matrix[][]){
        // int stRow = 0;
        // int stCol = 0;
        // int enRow = Matrix.length-1;
        // int enCol = Matrix[0].length - 1;

        // while (stRow <= enRow && stCol <= enCol) {
        //     // Top
        //     for(int j = stCol; j<=enCol; j++){
        //           System.out.print(Matrix[stRow][j]+" ");
        //     }
        //     //Right
        //     for(int i = stRow + 1; i<= enRow; i++){
        //         System.out.print(Matrix[i][enCol]+" ");
        //     }
        //     //Bottom
        //     for(int j = enCol - 1; j>=stCol; j--){
        //         if(stRow == enRow){
        //             break;
        //         }
        //         System.out.print(Matrix[enRow][j]+" ");
        //     }
        //     //left
        //     for(int i = enRow - 1; i>=stRow + 1; i--){
        //         if(stCol == enCol){
        //             break;
        //         }
        //         System.out.print(Matrix[i][stCol]+" ");
        //     }
        // stCol++;
        // stRow++;
        // enCol--;
        // enRow--;
        // }
        // System.out.println();
        int stRow = 0;
        int stCol = 0;
        int enRow = Matrix.length-1;
        int enCol = Matrix[0].length-1;

        while(stRow <= enRow && stCol <= enCol){
        for(int j = stCol; j<=enCol; j++){
            System.out.print(Matrix[stRow][j]+" ");
        }
        for(int i = stRow+1; i<=enRow; i++){
            System.out.print(Matrix[i][enCol]+" ");
        }
        for(int j = enCol-1; j>=stCol; j--){
            if(stRow == enRow){
                break;
            }
            System.out.print(Matrix[enRow][j]+" ");
        }
        for(int i = enRow-1; i>=stRow+1; i--){
            if(stCol == enCol){
                break;
            }
            System.out.print(Matrix[i][stCol]+" ");
        } 
        stCol++;
        stRow++;
        enCol--;
        enRow--; 
        }  
        System.out.println();   
    }
}