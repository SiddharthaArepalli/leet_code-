class Solution {
    public static void sub(int arr[] , int i , List<Integer> cur , List<List<Integer>> ans){
        if(i >= arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[i]);
        sub(arr, i+1, cur, ans);
        cur.remove(cur.size()-1);
        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        sub(arr, i+1, cur, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        sub(nums, 0, cur,ans);
        return ans;
    }
}