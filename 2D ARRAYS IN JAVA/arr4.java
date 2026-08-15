public class arr4 {
    public static void main(String[] args){
         int Matrix[][] = {
              {10,20,30,40},
              {15,25,35,45},
              {27,29,37,48},
              {32,33,39,50}
         };
         int key = 51;
         stairCaseSearch(Matrix, key);
    }
    public static boolean stairCaseSearch(int Matrix[][], int key){
              int row = 0,  col = Matrix[0].length-1;
              while(row < Matrix.length && col >= 0){
                   if(Matrix[row][col] == key){
                     System.out.println("key found at "+ "("+row+","+col+")");
                     return true;
                   }else if(key < Matrix[row][col]){
                     col--;
                   }else{
                    row++;
                   }
              }
              System.out.println("Key not found!");
              return false;
    }
}
