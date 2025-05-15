class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0;
        int j = 1;
        int maxP = 0;
        int pro = 0;
        while(i < n && j < n){
             if(prices[i] < prices[j]){
                 pro+=prices[j]-prices[i];
             }
            i++;
            j++;
        }
        return pro;
    }
}