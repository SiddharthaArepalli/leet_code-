class Solution {
    public static int floorZero(int nums[]){
        int l = 0;
        int h = nums.length-1;
        int lef = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m]<0){
                lef = m;
                l  = m + 1;
            }else{
                h = m - 1;
            }
        }
        return lef;
    }
    public static int ceilZero(int nums[]){
        int l = 0;
        int h = nums.length-1;
        int right = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m]>0){
                right  = m;
                h = m - 1;
            }else{
               l  = m + 1;
            }
        }
        return right;
    }
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = ceilZero(nums);
        int neg = floorZero(nums);
        int posCount = pos == -1?0:n-pos;
        int negCount = neg+1;
        return Math.max(negCount , posCount);
    }
}