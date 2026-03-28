/*  author: @rabhisekkar
    description: print all possible ways to place n queens on n x n chessboard

    constraints:
    - no two queens attack each other
    - no same row, column, or diagonal

    TC = O(n!)        // approximate (backtracking)
    SC = O(n^2)       // board + recursion stack
*/

public class NQueens {
    // function to print board
    public static void printBoard(char board[][]){
        System.out.println("----chess board----");

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // check if safe to place queen
    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diag left up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diag right up
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    // backtracking function
    public static void nQueens (char board[][], int row) {
        // base case
        if(row == board.length) {
            printBoard(board);
            return;
        }

        // column loop: try placing queen in each column
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';    // place queen
                nQueens(board, row+1);    // function call: recurse
                board[row][j] = 'X';    // backtracking step: remove queen
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // initialize board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }
}

// output
// ----chess board----
// X Q X X 
// X X X Q
// Q X X X
// X X Q X
// ----chess board----
// X X Q X
// Q X X X
// X X X Q
// X Q X X