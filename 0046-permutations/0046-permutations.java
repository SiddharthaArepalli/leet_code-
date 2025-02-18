class Solution {
    public static void getPermute(int nums[] , List<List<Integer>> ans, int s){
        if(s == nums.length){
            List<Integer> cur = new ArrayList<>();
            for(int n : nums){
                cur.add(n);
            }
            ans.add(cur);
        }
        for(int i = s ;i<nums.length;i++){
            swap(nums, s, i);
            getPermute(nums, ans, s+1);
            swap(nums, s, i);
        }
    }
    public static void swap(int []nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermute(nums, ans,0);
        return ans;
    }

}