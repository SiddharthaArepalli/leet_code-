class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int tot = 0;
        for(int num : nums){
            tot+=num;
        }
        int lSum = 0;
        for(int i = 0;i<n;lSum+=nums[i++]){
            if(lSum*2 == tot-nums[i]){
                return i;
            }
        }
        return -1;
    }
}