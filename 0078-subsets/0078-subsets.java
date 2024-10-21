class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        ArrayList<List<Integer>> al = new ArrayList<>();
        int it = 1<<n;
        for(int i = 0;i<it;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i&(1<<j))!=0){
                    ls.add(nums[j]);
                }
            }
            al.add(ls);
        }
        return al;
    }
}