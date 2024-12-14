class Solution {
    public long continuousSubarrays(int[] nums) {
        int n =  nums.length;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int s = 0;
        int e = 0;
        int count = 0;
        while(e < n){
            tm.put(nums[e], tm.getOrDefault(nums[e],0)+1);
            while(tm.lastEntry().getKey() - tm.firstEntry().getKey() > 2){
                tm.put(nums[s], tm.getOrDefault(nums[s],0)-1);
                if(tm.get(nums[s]) == 0){
                    tm.remove(nums[s]);
                }
                s++;
            }
            count+=(e-s+1);
            e++;
        }
        return count;
    }
}