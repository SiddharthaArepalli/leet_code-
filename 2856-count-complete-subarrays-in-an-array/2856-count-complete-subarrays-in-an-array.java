class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int uC = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        uC = hs.size();
        int cS = 0;
        // HashSet<Integer> win = new HashSet<>();
         for (int i = 0; i < n; i++) {
            Set<Integer> win = new HashSet<>();
            for (int j = i; j < n; j++) {
                win.add(nums[j]);
                if (win.size() == uC) {
                    cS++;
                }
            }
        }
        return cS;
    }
}