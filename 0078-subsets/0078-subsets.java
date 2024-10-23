class Solution {
    public static void sub(int arr[] , int i , List<Integer> cur , List<List<Integer>> ans){
        if(i >= arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[i]);
        sub(arr, i+1, cur, ans);
        cur.remove(cur.size()-1);
        sub(arr, i+1, cur, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        sub(nums, 0, cur,ans);
        return ans;
    }
}