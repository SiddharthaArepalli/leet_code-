class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long count = 0;
        int i = 0;
        int j = 0;
        int m = Integer.MIN_VALUE;
        int c = 0;
        for(int s = 0;s<n;s++){
            m =  Math.max(m , nums[s]);
        }
        while(j < n){
            if(nums[j] == m){
                c++;
            }
            while(c>=k){
                if(c==k) count+=(n-j);
                if(nums[i] == m){
                    c--;
                }
                i++;
            }
             j++;
        } 
        return count; 
    }
}