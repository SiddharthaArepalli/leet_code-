class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxCount = 0;
        for(int i = 0;i<n;i++){
            int j = i;
            while(j<n){
                 if(nums[j] == nums[i]+1){
                    maxCount = Math.max(j-i+1,maxCount);
                 }else if(nums[j] > nums[i]+1){
                    break;
                 }
                 j++;
            }
        }
        return maxCount;
    }
}