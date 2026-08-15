import java.util.ArrayList;
import java.util.List;

public class N {

    public boolean isSafe(int row , int cols, char[][]board){
        //horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j]=='Q'){

                return false;

            }
        }
        //vertical

        for(int i=0; i<board[0].length; i++){
            if(board[i][cols] == 'Q'){
                return false;

            }

        }
        // upper left

        int r = row; 

        for(int c=cols; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
       // upper rigth

       r = row;

       for(int c=cols; c<board.length && r>=0; r--,c++){
        if(board[r][c]=='Q'){
            return false;
        }
       }
       //lower left

       r = row;

       for(int c=cols; c>=0 && r<board.length; r++, c--){
        if(board[r][c]=='Q'){
            return false;
        }
       }
       // lower rigth

       r=row;

       for(int c=cols; c<board.length && r<board.length; c++, r++){
          if(board[r][c]=='Q'){
            return false;
        }
       }

       return true;
    }
    public void saveBoard(char [][] board,List<List<String>> allboard){
        String row = " ";

        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){

            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                    
             } else {

             row += '.';

             }
            }
            newBoard.add(row);
        }
        allboard.add(newBoard);
    }
    //impliment backtraking
    public void helper(char [][] board,List<List<String>> allboard,int cols){

        if(cols == board.length){

            saveBoard(board , allboard);

            return;
        }

        for(int row=0; row<board.length; row++){
            if(isSafe(row,cols,board)){
                board[row][cols] = 'Q';

                helper(board, allboard, cols+1);

                board[row][cols] = '.'; //remove queens becouse wrong sitting queens (backtraking)
            }
        }
    }

    public List<List<String>>solveNQueens(int n){

        List<List<String>> allboard = new ArrayList<>();

        char [][] board = new char[n][n];

                for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allboard, 0);
        return allboard;   // ✅ return added

    }
    public static void main(String[] args) {
        N obj = new N();
        int n = 4;
        List<List<String>> result = obj.solveNQueens(n);
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
