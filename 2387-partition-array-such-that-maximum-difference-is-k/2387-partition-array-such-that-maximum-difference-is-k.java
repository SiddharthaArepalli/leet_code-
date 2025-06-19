class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        int c = 1;
        Arrays.sort(nums);
        int min = nums[0];
        for(int i = 1;i<n;i++){
             if(Math.abs(nums[i]-min)>k){
                 c++;
                 min  = nums[i];
             }
        }
        return c;
    }
}