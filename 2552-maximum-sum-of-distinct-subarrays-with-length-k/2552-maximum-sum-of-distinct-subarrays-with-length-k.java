import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        long currentSum = 0;
        HashSet<Integer> hs = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (hs.contains(nums[right]) || hs.size() >= k) {
                hs.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            hs.add(nums[right]);
            currentSum += nums[right];

            if (hs.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
