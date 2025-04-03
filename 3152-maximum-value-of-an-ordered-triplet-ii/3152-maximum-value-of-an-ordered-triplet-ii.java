class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = -1;
        pref[n-1] = nums[n-1];
        int lefMax = nums[0];
        for(int i = n-2;i>=0;i--){
            pref[i] = Math.max(pref[i+1] , nums[i]);
        }
        long maxAns = 0;
        for(int i = 1;i<n-1;i++){
            // lefMax = Math.max(nums[i] , lefMax);
            System.out.println((long)(lefMax-nums[i])*pref[i+1]);
            maxAns = Math.max(maxAns , (long)(lefMax-nums[i])*pref[i+1]);
            if(nums[i] >= lefMax){
                lefMax = nums[i];
            }
        }
        return maxAns;
    }
}