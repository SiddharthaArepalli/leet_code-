class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(nums[i] == key){
                 hs.add(i);
                 int s = i-1;
                 int l = i+1;
                 int c = k;
                 int cc = k;
                 while(s >= 0 && c>0){
                      hs.add(s);
                      s--;
                      c--;
                 }
                 while(l<n && cc>0){
                      hs.add(l);
                      l++;
                      cc--;
                 }
            }
        }
        List<Integer> res = new ArrayList<>(hs);
        Collections.sort(res);
        return res; 
    }
}