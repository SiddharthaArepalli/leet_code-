class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                long tar = ((long)target -(nums[i]+nums[j]));
                int p =j+1;
                int q = n-1;
                while(p<q){
                    long sum = nums[p]+nums[q];
                    if(sum == tar){
                        res.add(Arrays.asList(nums[i], nums[j] , nums[p], nums[q]));
                        while( p<q && nums[p] == nums[p+1]) p++;
                        while(p<q && nums[q] == nums[q-1]) q--;
                        p++;
                        q--;
                    }else if(sum < tar){
                        p++;
                    }
                    else{
                        q--;
                    }
                }
            }
        }
        return res;
    }
}