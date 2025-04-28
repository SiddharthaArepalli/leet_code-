class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        long pro = nums[0];
        int count = 0;
        while(j<n  && i<n){
            if(pro < k){
                count+=(j-i+1);
                j++;
                if(j<n) pro*=nums[j];
            }
            else{
                pro/=nums[i];
                i++;
                if (i > j && i < n) {
                    j = i; 
                    if (i < n) pro = nums[i];
                }
            }
        }
        return count;
    }
}