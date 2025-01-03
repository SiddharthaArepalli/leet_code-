class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long pref[] = new long[n];
        long sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            pref[i] = sum;
        }
        int c = 0;
        for(int i = 0;i<n-1;i++){
            if(pref[i] >= pref[n-1]-pref[i]){
                c++;
            }
        }
        return c;
    }
}