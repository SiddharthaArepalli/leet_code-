class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        else if(count > 1){
            return false;
        }
        else if(nums[0] < nums[(nums.length) - 1]){
            return false;
        }
      return true;
    }
}