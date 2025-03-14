class Solution {
    public static boolean validate(int nums[] , long m , long k){
        if (m == 0) return false;
        long c = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
               c+=nums[i]/m;
            }    
        }
        return c>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        long cand = 0;
        for(int i : candies){
            cand+=i;
        }
        int n = candies.length;
        long l = 1;
        long h = cand;
        int ans = 0;
        while(l<=h){
            long m = l + (h-l)/2;
            if(validate(candies,m,k)){
                ans = (int)m;
                l = m+1;
            }
            else{
                h = m-1;
            }
        }
        return ans;
    }
}