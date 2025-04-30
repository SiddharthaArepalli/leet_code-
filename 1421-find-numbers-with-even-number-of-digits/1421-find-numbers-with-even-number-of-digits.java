class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int num = nums[i];
            int c = 0;
            while(num > 0){
                int r = num%10;
                c++;
                num = num/10;
            }
            if(c%2 == 0) count++;
        }
        return count;
    }
}