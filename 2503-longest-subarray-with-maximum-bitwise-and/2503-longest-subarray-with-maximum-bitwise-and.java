class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxNum = Math.max(maxNum , nums[i]);
        }
        int c = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == maxNum){
                 c++;
                 maxLen = Math.max(c , maxLen);
            }else {
                 c = 0;
            }
        }
        return maxLen;
    }
}