class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int dup = 0;
         for(Integer i : nums){
            if(hm.get(i) >= 2){
                dup = i;
            }
            // if(hm.get(i)== nums.length){
            //     dup = i;
            // }
         }
         
         return dup;
    }
}