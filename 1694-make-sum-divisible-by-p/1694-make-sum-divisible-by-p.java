class Solution {
    public int minSubarray(int[] nums, int p) {
        // int n = nums.length;
        // int totSum = 0;
        // for(int i = 0;i<n;i++){
        //     totSum+=nums[i];
        // }
        // if(totSum%p == 0){
        //     return 0;
        // }
        // int rem = totSum%p;
        // int minLen = Integer.MAX_VALUE;
        // int flag = 0;
        // for(int i = 0;i<n;i++){
        //     int sum = 0;
        //     for(int j = i;j<n;j++){
        //         sum = (sum + nums[j]) % p;
        //         if(sum == rem){
        //             int l  = j-i+1;
        //             minLen = Math.min(l , minLen);
        //         }
        //     }
        // }
        // return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
        long rem = 0;
        for (int x : nums){
           rem = (rem + x) % p; 
        }
        if (rem == 0) return 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        long pre = 0;
        int res = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            pre = (pre + nums[i]) % p;
            if (mp.containsKey((int)((pre - rem + p) % p))) 
                res = Math.min(res, i - mp.get((int)((pre - rem + p) % p)));
            mp.put((int)pre, i);
        }
        return res == nums.length ? -1 : res;
    }
}