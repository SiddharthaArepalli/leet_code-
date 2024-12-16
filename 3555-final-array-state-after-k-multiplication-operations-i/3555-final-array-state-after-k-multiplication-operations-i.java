class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int i = 0;i<k;i++){ 
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0;j<n;j++){
                if(nums[j] < min){
                    minIdx = j;
                    min = nums[j];
                }
            }
            nums[minIdx] = nums[minIdx]*multiplier;

        }
        return nums;
    }
}