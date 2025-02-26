class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = nums[0];
        for(int i = 1;i<n;i++){
            pref[i] = pref[i-1]+nums[i];
        }
        int maxPrefSum = 0;
        int minPrefSum = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            maxPrefSum = Math.max(pref[i], maxPrefSum);
            minPrefSum = Math.min(pref[i], minPrefSum);
        }
        return maxPrefSum-minPrefSum;
    }
}