class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int dAr[] = new int[nums.length+1];
        for(int i = 0;i<queries.length;i++){
            int st = queries[i][0];
            int end = queries[i][1];
            dAr[st]+=-1;
            dAr[end+1]+=1;
        }
        for(int i = 1;i<dAr.length;i++){
            dAr[i] = dAr[i]+dAr[i-1];
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]+dAr[i]>0){
                 return false;
            }
        }
        return true;
    }
}