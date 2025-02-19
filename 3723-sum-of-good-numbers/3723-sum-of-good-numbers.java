class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
         int n = nums.length;
         int sum = 0;
         for(int i = 0;i<n;i++){
            boolean check = true;
            int l = i-k;
            int r = i+k;
            if(l>=0){
                 if(nums[i]<=nums[l]){
                     check = false;
                 }
            }
            if(r<=n-1){
                 if(nums[i]<=nums[r]){
                     check = false;
                 }
            }
            if(check){
                sum+=nums[i];
            }
         }
         return sum;
    }
}