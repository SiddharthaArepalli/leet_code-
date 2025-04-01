class Solution {
   public static long solve(int ind ,int[][] ques, long[] dp){
        if(ind >= ques.length){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        //  include
        long inc = (long)ques[ind][0] + solve(ind+ques[ind][1]+1, ques,dp);
        // exclude
        long exc = solve(ind+1, ques,dp);
        dp[ind] = Math.max(inc ,exc);
        return dp[ind];
   }

    public long mostPoints(int[][] ques) {
        int n = ques.length;
        long dp[] = new long[n];
        Arrays.fill(dp,-1);
        long ans = solve(0,ques,dp);
        return ans;
    }
}