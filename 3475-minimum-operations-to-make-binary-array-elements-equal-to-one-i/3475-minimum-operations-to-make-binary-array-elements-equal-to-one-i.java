class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i = 0;i<=n-3;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                count++;
            }
        }
        for(int i : nums){
            if(i == 0){
                return -1;
            }
        }
        return count;
    }
}