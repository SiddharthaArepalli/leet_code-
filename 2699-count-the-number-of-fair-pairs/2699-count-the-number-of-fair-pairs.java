class Solution {
    public long countFairPairs(int[] nums, int low, int up) {
         int n = nums.length;
        Arrays.sort(nums);
        long c = 0;
        int i = 0;
        while (i < n) {
            int l = i + 1;
            int r = n - 1;
            int lP = n;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[i] + nums[mid] >= low) {
                    lP = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            l = i + 1;
            r = n - 1;
            int hP = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[i] + nums[mid] <= up) {
                    hP = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            if (lP <= hP) {
                c += (hP - lP + 1);
            }

            i++;
        }
        return c;
    }
}