class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(0,0,nums,target);
        return count;
    }

    public void backtrack(int ind , int res, int[] nums, int target){

        if(ind == nums.length){
            if(res == target){
                count++;
            }
            return ;
        }
        
        backtrack(ind+1, res-nums[ind], nums, target);
        backtrack(ind+1, res+nums[ind], nums, target);
    }
}