class Solution {
    public int maxBalancedShipments(int[] w) {
        int n = w.length;
        int c = 0;
        int maxW  =  w[0];
        for(int i = 0;i<n;i++){
             if(w[i] > maxW){
                 maxW = w[i];
             }else if(w[i] < maxW){
                 c++;
                 if(i!=n-1) maxW = w[i+1];
                 continue;
             }
        }
        return c;
    }
}