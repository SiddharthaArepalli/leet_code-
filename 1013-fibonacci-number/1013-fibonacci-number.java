class Solution {

    public static int f(int n , int dp[]){
        if(n <= 1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n] = f(n-1 , dp)+f(n-2 ,dp);
        return dp[n];
    }
    public int fib(int n) {
        int dp[] = new int[n+1];
        for(int i = 0;i<=n;i++){
            dp[i] = -1;
        }
        return f(n , dp);
    }
}