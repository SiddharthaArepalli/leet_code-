class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int diff[] = new int[n+1];
        int sum = 0;
        int j = 0;
        for(int i = 0;i<n;i++){
            while(sum + diff[i] < nums[i]){
                if(j == queries.length){
                    return -1;
                }
                int st = queries[j][0];
                int en = queries[j][1];
                int val = queries[j][2];
                j++;
                if(en < i) continue;
                diff[Math.max(st,i)]+=val;
                diff[en+1]-=val;
            }
            sum+=diff[i];
        }
        return j;
    }
}