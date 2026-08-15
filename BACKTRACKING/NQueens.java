public class NQueens {
    static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        placeQueens(board, 0);
    }

    static void placeQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';   // choice
                placeQueens(board, row + 1);
                board[row][col] = '.';   // backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        int n = 6;
        solveNQueens(n);
    }
}
