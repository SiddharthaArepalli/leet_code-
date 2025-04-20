class Solution {
    public int numRabbits(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            } else {
                c++;
            }
        }
        for (int i : hm.keySet()) {
            int ans = hm.get(i);
            int groups = (int) Math.ceil((double) ans / (i + 1));
            c += groups * (i + 1);
        }
        return c;
    }
}