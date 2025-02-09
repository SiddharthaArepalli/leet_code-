class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Long,Long> hm = new HashMap<>();
        long gp = 0;
        long tot = (long)n*(n-1)/2;
        for(int i = 0;i<n;i++){
             long dif = nums[i]-i;
             if(hm.containsKey(dif)){
                 gp+=hm.get(dif);
             }
             hm.put(dif,hm.getOrDefault(dif,0l)+1);
        }
        long ans = tot-gp; 
        return ans;
    }
}