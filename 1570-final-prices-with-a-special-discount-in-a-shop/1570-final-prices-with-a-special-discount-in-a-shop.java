class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int i = 0;
        int j = i+1;
        int flag = 0;
        while(i < n-1){
            if(prices[j]<= prices[i]){
                prices[i] = prices[i]-prices[j];
                if(flag == 1){
                    i++;
                    j=i+1;
                    flag = 0;
                }else{
                    i++;
                    j++;
                }
            }
            else{
               flag = 1;
               j++;
               if(j == n){
                 i++;
                 j = i+1;
               }
            }
        }
        return prices;
    }
}
            // if(prices[i] >= prices[i+1]){
            //     prices[i] = prices[i]-prices[i+1];
            // }