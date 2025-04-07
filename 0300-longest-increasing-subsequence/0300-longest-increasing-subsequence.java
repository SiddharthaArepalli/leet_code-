class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(nums == null || nums.length == 0){
            return 0;
        }
        TreeSet<Integer> res = new TreeSet<>();
        for(int num : nums){
            Integer cl = res.ceiling(num);
            if(cl!=null){
                res.remove(cl);
            }
            res.add(num);
        }
        return res.size();
    }
}