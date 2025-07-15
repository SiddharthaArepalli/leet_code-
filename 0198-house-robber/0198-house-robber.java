class Solution {
    int n;
    int dp[];
    public int rob(int[] nums) {
        n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0 ,nums);
    }
    public int solve(int ind , int nums[]){
         if(ind >= n){
             return 0;
         }
         if(dp[ind]!=-1){
             return dp[ind];
         }
         int skip = solve(ind+1 , nums);
         int cons = nums[ind] + solve(ind+2 , nums);
         dp[ind] = Math.max(skip , cons);
         return Math.max(skip , cons);
    }
}