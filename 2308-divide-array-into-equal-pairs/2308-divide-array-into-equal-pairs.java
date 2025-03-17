class Solution {
    public boolean divideArray(int[] nums) {
        int c = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                c++;
                hs.remove(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }
        return c==nums.length/2;
    }
}