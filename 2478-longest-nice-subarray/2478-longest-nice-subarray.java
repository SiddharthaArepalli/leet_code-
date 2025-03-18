class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int xSum = 0;
        int cSum = 0;
        int max = 0;
        while(j<n){
            cSum += nums[j];
            xSum ^= nums[j];
            while(xSum != cSum){
                cSum -= nums[i];
                xSum ^= nums[i];
                i++;
            }
            max = Math.max(j-i+1,max);
            j++;
        }
        return max;
        
    }
}