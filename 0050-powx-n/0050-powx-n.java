class Solution {
    public double myPow(double x, int n) {
           long nn = n;
           if(nn == 0) return 1;
          if(nn < 0){
              nn = -nn;
              x = 1/x;
          }
          double res = 1;
          while(nn>0){
               if((nn&1)!=0){
                   res*=x;
               }
               x = x*x;
               nn=nn>>1;
          }
          return res;
    }
}