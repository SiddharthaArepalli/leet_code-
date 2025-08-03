class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int c = 0;
        int inc = 0;
        for(int i = 1;i<n-1;i++){
             if(i == 1 && nums[i] <= nums[i-1]) return false;
             if((nums[i]>nums[i-1] && nums[i] > nums[i+1]) && inc == 0){
                  inc = 1;
                  c++;
             }else if((nums[i]<nums[i-1] && nums[i] < nums[i+1]) && inc == 1){
                  inc = 0;
                  c++;
             }
        }
        return c == 2;
    }
}