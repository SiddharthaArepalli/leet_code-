class Solution {
    public int[][] merge(int[][] intv) {
        int n = intv.length;
        Arrays.sort(intv, (a,b)-> Integer.compare(a[0],b[0]));
        int res[][] = new int[n][2];
        int pAt = intv[0][0];
        int pDt = intv[0][1];
        res[0] = new int[]{pAt, pDt}; 
        int ind = 0;
        for(int i = 1;i<n;i++){
            if(pDt>=intv[i][0]){
                pDt = Math.max(pDt, intv[i][1]);
                res[ind][1] = pDt;
            }
            else{
                ind++;
                res[ind]=new int[]{intv[i][0],intv[i][1]};
                pAt = intv[i][0];
                pDt = intv[i][1];
            }
        }
        return Arrays.copyOf(res,ind+1);
    }
}