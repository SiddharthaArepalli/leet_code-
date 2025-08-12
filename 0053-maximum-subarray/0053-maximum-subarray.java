class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0;i<n;i++){
              if(curSum+nums[i] < 0){
                   maxSum = Math.max(curSum+nums[i] , maxSum);
                  curSum = 0;
              }else{
                curSum = curSum + nums[i];
                maxSum = Math.max(curSum , maxSum);
              }

        }
        return maxSum;
    }
}