class Solution {
    public boolean isPowerOfTwo(int n) {
        long y = 1;
        if(n == 1) return true;
        while(y < n){
            y = y<<1;
            if(y == n){
                 return true;
            }
        }
        return false;
    }
}