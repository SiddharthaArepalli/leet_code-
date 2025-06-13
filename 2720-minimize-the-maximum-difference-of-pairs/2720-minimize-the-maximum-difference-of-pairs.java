class Solution {
    public boolean canMake(int nums[] , int m , int p){
        int n = nums.length;
        int c = 0;
        int i = 0;
        while(i<n-1){
            if(nums[i+1]-nums[i]<=m){
                c++;
                i+=2;
            }else{
                i++;
            }
            if(c>=p) return true;
        }
        return false;
    }
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int h = nums[n-1]-nums[0];
        int ans = 0;
        while(l<=h){
            int m = l+(h-l)/2;
            if(canMake(nums , m , p)){
                 ans = m;
                 h = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
}