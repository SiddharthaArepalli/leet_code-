class Solution {
     int MOD = 1000000007;
     long fastPower(long x, long n) {
        long res = 1;
        x %= MOD;
        while (n > 0) {
            if(n%2!=0) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            n = n>>1;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long od = 0;
        long ev = 0;
        if(n%2 == 0){
           od = n/2;
           ev = n/2;
        }else{
            ev = n/2+1;
            od = n/2;
        }
        return (int)((fastPower(5,ev) * fastPower(4,od))%MOD);
    }
}