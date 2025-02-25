class Solution {

    public int numOfSubarrays(int[] arr) {
         int n = arr.length;
         int res = 0;
         int pref = 0;
         int eC = 1;
         int oC = 0;
         int mod = 1000000007;
         for(int num : arr){
              pref+=num;
              if(pref%2!= 0){
                res+=eC;
                oC++;
              }
              else{
                 res+=oC;
                 eC++;
              }
              res = res%mod;
        }
        return res;
    }
}