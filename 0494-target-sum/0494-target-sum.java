class Solution {
    public int count = 0;
    public void rec(int nums[] , int tar , int val ,int ind){
        int n = nums.length;
        if(ind == n && val==tar){
             count++;
             return;
        }
        if(ind == n && tar!=val){
             return;
        }
        rec(nums, tar , val-nums[ind] , ind+1);
        rec(nums , tar , val+nums[ind] , ind+1);
    }


    public int findTargetSumWays(int[] nums, int target) {
        rec(nums , target ,0,0);
        return count;
    }
}