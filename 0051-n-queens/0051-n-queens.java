class Solution {

    public boolean check(int r , int c , char board[][] , int n){
         int i = r ; int j = c;
          while(i >=  0 && j >= 0){
               if(board[i][j] == 'Q'){
                  return false;
               }
               i-- ; j--;
          }
          i = r; j = c;
          while(i >= 0 &&  j < n){
                if(board[i][j] == 'Q'){
                     return false;
                }
                i-- ; j++;
          }
          return true;
    }
    public void find(int row , List<List<String>>ans, char board[][], int col[] , int n){   
        if(row == n){
            List<String> b = new ArrayList<>();
            for(char[] rArr : board){
                b.add(new String(rArr));
            }
            ans.add(b);
            return;
        }    
        for(int j = 0;j<n;j++){
             if(col[j]==0 && check(row , j , board , n)){
                 board[row][j] = 'Q';
                 col[j] = 1;
                 find(row+1, ans , board , col , n);
                 board[row][j] = '.';
                 col[j] = 0;
             }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][]  = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                 board[i][j] = '.';
            }
        }
        int col[] = new int[n];
        find(0,ans, board , col , n);
        return ans;
    }
}