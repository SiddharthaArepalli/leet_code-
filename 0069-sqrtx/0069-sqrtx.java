class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int h = x;
        while(l<=h){
            int m = l+(h-l)/2;
            long val =(long)m*m;
            if(val == x){
               return m;
            }
            else if(val > x){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return h;
    }
}