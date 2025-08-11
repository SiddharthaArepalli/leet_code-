class Solution {
    public int hammingDistance(int x, int y) {
      int c =0;
        int ind = -1;
        for(int i = 0;i<31;i++){
            if((x&1)!=(y&1)){
                c++;
                if(c==1) ind = i;
            }
            if(c==2) return i-ind;
            x= x>>1;
            y = y>>1;
        }
        return c;
    }
}