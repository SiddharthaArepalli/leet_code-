class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            boolean f = (nums[i]%2==0);
            boolean s = (nums[i+1]%2==0);
            if(f==s){
                return false;
            }
        }
        return true;
    }
}