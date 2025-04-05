class Solution {
    static int totSum = 0;
    public static void findSum(int nums[] , int ind , int sum){
        int n = nums.length;
        // base 
        if(ind>= n){
            totSum+=sum;
            return;
        }
        findSum(nums , ind+1 ,sum);
        int prevSum = sum;
        findSum(nums,ind+1,sum^nums[ind]);
        sum = prevSum; 
    }
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        totSum = 0;
        findSum(nums,0,0);
        return totSum;
    }
}