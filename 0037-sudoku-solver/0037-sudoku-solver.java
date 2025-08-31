class Solution {
    public static boolean valid(char board[][] , int r , int c, char d){
        for(int i = 0;i<9;i++){
             if(board[r][i] == d) return false;
             if(board[i][c] == d) return false;
        }
        int s_i = (r/3)*3;
        int s_j = (c/3)*3;
        for(int  i = 0;i<3;i++){
             for(int j = 0;j<3;j++){
                 if(board[s_i+i][s_j+j] == d){
                     return false;
                 }
             }
        }
        return true;
    }
    public static boolean solve(char board[][]){
         for(int i = 0;i<9;i++){
             for(int j = 0;j<9;j++){
                  if(board[i][j] == '.'){
                      for(char k = '1' ;k<='9';k++){
                          if(valid(board , i , j , k)){
                                board[i][j] = k;
                                if(solve(board)){
                                     return true;
                                }
                                board[i][j] = '.';
                          }
                      }
                      return false;
                  }
             }
         }
         return true;
    }
    public void solveSudoku(char[][] board) {
         solve(board);
    }
}