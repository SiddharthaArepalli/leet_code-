class Solution {
    public int diagonalSum(int[][] mat) {
        int n  = mat.length;
        int diaSum = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if((i == j) || (i+j) == (n-1)){
                      diaSum+=mat[i][j];
                }
            }
        }

        return diaSum;
    }
}