class Solution {
    public static boolean val(int[] piles , int minPar, int n, int h){
            long sum = 0;
            for(int j = 0;j<n;j++){
                sum+=(piles[j]+minPar-1)/minPar;
            }
            if(sum > h){
                return false;
            }
           return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int minPar = Arrays.stream(piles).max().getAsInt();
        int l = 1;
        int hi = minPar;
        int ans =hi;
        while(l<=hi){
            int m = (l+hi)/2;
            if(val(piles,m, n, h)){
                ans = m;
                hi = m -1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
}