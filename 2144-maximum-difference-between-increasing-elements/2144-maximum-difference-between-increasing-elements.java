class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int suf[] = new int[n];
        int maxDiff = -1;
        suf[n-1] = nums[n-1]; 
        for(int i = n-2;i>=0;i--){
            suf[i] = Math.max(suf[i+1] , nums[i]);
        }
        for(int i = 0;i<n;i++){
             maxDiff = Math.max(maxDiff , suf[i]-nums[i]);
        }
        return (maxDiff == 0)?-1:maxDiff;
    }
}