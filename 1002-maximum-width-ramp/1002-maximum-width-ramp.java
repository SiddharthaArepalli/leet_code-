class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        // int maxRamp = 0;
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i]<=nums[j]){
        //             int ramp = j-i;
        //             maxRamp = Math.max(ramp,maxRamp);
        //         }
        //     }
        // }
        // return maxRamp;
        int max = nums[n-1];
        int cop[] = new int[n];
        for(int i  = n-1;i>=0;i--){
            max = Math.max(nums[i], max);
            cop[i] = max;
        }
        int l = 0;
        int r = l+1;
        int maxRamp = 0;
        while(r < n){
            if(nums[l]<=cop[r]){
                maxRamp = Math.max(r-l,maxRamp);
                r++;
            }
            else{
                l++;
                if(l == r){
                    r++;
                }
            }
        }
        return maxRamp;  
    }
}