class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        Arrays.sort(nums);
        int res[][] = new int[n/3][3];
        for(int i = 0;i<n;i+=3){
            if(nums[i+2] - nums[i]<=k){
                 res[c][0] = nums[i];
                 res[c][1] = nums[i+1];
                 res[c][2] = nums[i+2];
                 c++;
            }else{
                return new int[0][0];
            }
        }
        return res;
    }
}