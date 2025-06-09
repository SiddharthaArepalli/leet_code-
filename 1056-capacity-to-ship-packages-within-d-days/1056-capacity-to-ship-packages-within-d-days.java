class Solution {
    public static boolean valid(int weights[] , int mid , int days){
            int c = 1;
            int n = weights.length;
            int cur = 0;
            for(int i = 0;i<n;i++){
                if(cur+weights[i]<=mid){
                    cur+=weights[i];
                }else{
                    c++;
                    cur=weights[i];
                }
            }
            return c<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = 0, min = 0;
        for (int w : weights) {
            max += w;
            min = Math.max(min, w);
        }
        while(min <= max){
             int mid = min+(max-min)/2;
             if(valid(weights , mid , days)){
                 max = mid-1;
             }else{
                 min = mid+1;
             }
        }
        return min;
    }
}