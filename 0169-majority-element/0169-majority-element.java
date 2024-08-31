class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        int majEle = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(hm.get(nums[i]) > ((nums.length)/2)){
                majEle = nums[i];
                break;
            }
        }
        return majEle;
    }
}