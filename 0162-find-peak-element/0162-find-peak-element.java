class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int ind = -1;
        if(n==1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-2]<nums[n-1]){
            return n-1;
        }
        for(int i = 1;i<n;i++){
            if(nums[i]>nums[i-1]){
                ind = i;
            }
        }
        return ind;
    }
}