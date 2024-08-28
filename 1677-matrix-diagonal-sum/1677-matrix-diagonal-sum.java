class Solution {
    public int diagonalSum(int[][] mat) {
        // int n  = mat.length;
        // int diaSum = 0;
        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<n;j++){
        //         if((i == j) || (i+j) == (n-1)){
        //               diaSum+=mat[i][j];
        //         }
        //     }
        // }

        // return diaSum;


       //  __________________________________

       int n = mat.length;
       int firstSum = 0;
       for(int i = 0;i<n;i++){
           firstSum+=mat[i][i];
       }
       int r = 0;
       int c = n-1;
       int secSum = 0;
       while(c >=0){
            secSum+=mat[r][c];
            r++;
            c--;
       }
       int totalSum =  firstSum+secSum;
       if(n%2!=0){
             totalSum-= mat[n/2][n/2];
       }
       return totalSum;
    }
}