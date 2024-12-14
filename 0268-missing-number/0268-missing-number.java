class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = 0;
        while(l<=h){
            int m = (l+h)/2;
            if(m == nums[m]){
                 ans = m+1;
                 l = m+1;
            }
            else if(m < nums[m]){
                h = m-1;
            }
        }
        return ans;
    }
}