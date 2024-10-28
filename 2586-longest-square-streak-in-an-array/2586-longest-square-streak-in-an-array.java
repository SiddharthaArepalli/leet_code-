class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            int root = (int)Math.sqrt(num);
            if(root*root == num && hm.containsKey(root)){
                hm.put(num, hm.get(root)+1);
                max = Math.max(hm.get(num), max);
            }
            else{
                hm.put(num,1);
            }
        }
        return max;
    }
}