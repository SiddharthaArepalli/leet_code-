class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        HashMap<Integer,HashSet<Integer>> r = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> c = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> ind = new HashMap<>();
        for(int i = 0;i<n;i++){
             for(int j = 0;j<m;j++){
                 if(board[i][j]!='.'){
                     int num = board[i][j]-'0';
                    r.computeIfAbsent(i, k -> new HashSet<>());
                    c.computeIfAbsent(j, k -> new HashSet<>());
                     if(!r.get(i).contains(num)){
                         r.get(i).add(num);
                     }else{
                         return false;
                     }
                     if(!c.get(j).contains(num)){
                         c.get(j).add(num);
                     }else{
                         return false;
                     }
                     
                     int id = (i/3)*3+(j/3);
                     ind.computeIfAbsent(id, k -> new HashSet<>());
                     if(!ind.get(id).contains(num)){
                         ind.get(id).add(num);
                     }else{
                         return false;
                     }
                 }
             }
        }
        return true;
    }
}