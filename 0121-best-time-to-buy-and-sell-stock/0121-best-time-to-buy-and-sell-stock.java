class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mP[] = new int[n];
        mP[0] = prices[0];
        for(int i = 1;i<n;i++){
            mP[i] = Math.min(prices[i] , mP[i-1]);
        }        
        int mmP[] = new int[n];
        mmP[n-1] = prices[n-1];
        for(int i = n-2;i>=0;i--){
            mmP[i] = Math.max(prices[i],mmP[i+1]);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(mmP[i]>mP[i]){
                ans = Math.max(ans , mmP[i]-mP[i]);
            }
        }
        return ans;
    }
}