class Solution {
    public static int findSum(int nums[] , int ind , int totSum){
        int n = nums.length;
        // base 
        if(ind>= n){
            return totSum;
        }
        //not include 
        int inc = findSum(nums , ind+1 ,totSum);
        // include
        int exc = findSum(nums,ind+1,totSum^nums[ind]);
        //bracktrack
        // totSum-=nums[ind]; 
        return inc+exc;
    }
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        // int totSum = 0;
        int res = findSum(nums,0,0);
        return res;
    }
}