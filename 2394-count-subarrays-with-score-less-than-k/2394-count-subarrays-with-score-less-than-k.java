class Solution {
    public long countSubarrays(int[] nums, long k) {
       int n = nums.length;
        int i = 0;
        int j = 0;
        long count = 0;
        long sum = nums[0];
        while(j<n){
            long score = sum*(j-i+1);
            if(score < k){
               count+=(j-i+1);
               j++;
              if(j<n) sum+=nums[j];
            }else{
                sum-=nums[i];
                i++;
            }
        }
        return count; 
    }
}