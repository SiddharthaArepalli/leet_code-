class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
          Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int count = 0;

        for (int num = 1; num <= n; num++) {
            if (bannedSet.contains(num)) continue;

            maxSum -= num;

            if (maxSum < 0) break;

            count++;
        }
        return count;
  
    }
}