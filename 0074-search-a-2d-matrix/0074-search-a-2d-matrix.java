class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(n == 1 && m== 1){
            return matrix[0][0] == t;
        }
        for(int i = 0;i<n;i++)
        {
            if(matrix[i][0]<=t && t<=matrix[i][m-1])
            {
               int l = 0;
               int r = m-1;
               while(l<=r)
               {
                int mid = (l+r)/2;
                if(matrix[i][mid] == t)
                {
                      return true;
                }
                else if (matrix[i][mid] < t)
                {
                    l = mid+1;
                }
                else
                {
                    r = mid-1;
                }
               }
            }
        }
        return false;
    }
}