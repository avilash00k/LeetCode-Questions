class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        return nqueen(board, 0);
    }
    public static int nqueen(char board[][], int row){
        int count=0;
        if(row==board.length){
            return 1;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                count+=nqueen(board, row+1);
                board[row][j]='X';
            }
        }
        return count;
    }
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--, j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}