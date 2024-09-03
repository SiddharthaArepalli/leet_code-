class Solution {
    public int maxProduct(int[] nums){
        int n = nums.length;
        int maxPro = nums[0];
        for(int i = 0;i<n;i++){
            int pro = nums[i];
            for(int j  = i+1;j<n;j++){
                maxPro = Math.max(pro,maxPro);
                pro = pro*nums[j];
            }
           maxPro = Math.max(pro,maxPro);
        }
        return maxPro;
        // int n = nums.length;
        // int pre = 1;
        // int suf = 1;
        // int ans = Integer.MIN_VALUE;
        
        // for(int i = 0;i<n;i++){
        //     if(pre == 0){
        //         pre = 1;
        //     }
        //     if(suf == 0){
        //         suf = 1;
        //     }
        //     pre = pre*nums[i];
        //     suf = suf*nums[n-i-1];
        //     ans = Math.max(ans,Math.max(pre,suf));
        // }
        // return ans;
    }
}