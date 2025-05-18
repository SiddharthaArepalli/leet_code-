class Solution {
    public int smallestIndex(int[] nums) {
         int n = nums.length;
         for(int i = 0 ;i<n;i++){
             int num = nums[i];
             int dS = 0;
             while(num > 0){
                 dS+=num%10;
                 num = num/10;
             }
             if(dS == i){
                 return i;
             }
         }
         return -1;
    }
}