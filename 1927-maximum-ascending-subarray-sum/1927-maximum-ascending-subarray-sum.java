class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int curSum = nums[0];
        for(int i = 1;i<n;i++){
            if(nums[i]>nums[i-1]){
                curSum+=nums[i];
            }
            else{
                 maxSum = Math.max(maxSum,curSum);
                curSum=nums[i];
            }
            maxSum = Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}