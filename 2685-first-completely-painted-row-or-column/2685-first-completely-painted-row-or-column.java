class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer, int[]> hm = new HashMap<>();
        for(int i = 0;i<m;i++){
           for(int j = 0;j<n;j++){
               hm.put(mat[i][j], new int[]{i,j});
           }
        }
        int rows[] = new int[m];
        int cols[] = new int[n];
        for(int i = 0;i<arr.length;i++){
              int ind[] = hm.get(arr[i]);
              int row = ind[0];
              int col = ind[1];
              rows[row]++;
              cols[col]++;
              if(rows[row] == n || cols[col] == m){
                 return i;
              } 
        }
        return -1;
    }
}