class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        int ar[] = new int[2];
        int ind = 0;
        for(int i : nums){
            if(hm.get(i) == 1){
                ar[ind] = i;
                if(ind <=1){
                    ind++;
                }
            }
            
        }
        return ar;
    }
}