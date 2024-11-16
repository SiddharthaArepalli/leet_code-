class Solution {
    private static boolean isSorted(ArrayList<Integer> subarray) {
        for (int i = 0; i < subarray.size() - 1; i++) {
            if (subarray.get(i + 1) - subarray.get(i) != 1) {
                return false;
            }
        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k){
        int n = nums.length;
        int res[] = new int[n-k+1];
        for(int i = 0; i<= n-k;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            for(int j = i; j<i+k;j++){
                 sub.add(nums[j]);
            }
            if(isSorted(sub)){
                 res[i] = sub.get(k-1);
            }
            else{
               res[i] = -1;
            }
        }
        return res;
    }
}