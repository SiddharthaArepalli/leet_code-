class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int preSum[] = new int[n];
        int prefSum = 0;
        int suffSum = 0;
        for(int i = 0;i<n;i++){
            prefSum = prefSum+nums[i];
            preSum[i] = prefSum;
        }
        int sufSum[] = new int[n];
        for(int i = n-1;i>=0;i--){
            suffSum= suffSum+nums[i];
            sufSum[i] = suffSum;
        }
        for(int i = 0;i<n;i++){
            if(preSum[i] == sufSum[i]){
                return i;
            }
        }
        return -1;
    }
}