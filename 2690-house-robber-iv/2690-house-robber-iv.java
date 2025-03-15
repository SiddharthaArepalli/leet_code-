class Solution {
    public static boolean validate(int nums[] , int m , int k){
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<=m){
                c++;
                i++;
            }
        }
        return c>=k;
    }
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        int l = min;
        int h = max;
        int ans = l;
        while(l<=h){
            int m = l+(h-l)/2;
            if(validate(nums,m,k)){
                ans = m;
                h = m -1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
}