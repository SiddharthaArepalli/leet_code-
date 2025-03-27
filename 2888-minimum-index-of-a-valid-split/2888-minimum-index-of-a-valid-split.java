class Solution {
    public int minimumIndex(List<Integer> nums) {
     int n = nums.size();
        HashMap<Integer, Integer> l = new HashMap<>();
        HashMap<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < n; i++) {
            r.put(nums.get(i), r.getOrDefault(nums.get(i), 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            r.put(num, r.getOrDefault(num,0) - 1);
            l.put(num, l.getOrDefault(num, 0) + 1);
            if (l.get(num) * 2 > (i + 1) && r.get(num) * 2 > (n - i - 1)) {
                return i;
            }
        }
        return -1;   
    }
}