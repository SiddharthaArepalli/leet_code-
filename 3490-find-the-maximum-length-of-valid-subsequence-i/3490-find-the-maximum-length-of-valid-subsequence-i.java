class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int oddLen = 0;
        int evenLen = 0;
        int alter = 0;
        int prev;
        if(nums[0]%2 == 0){
            evenLen++;
            alter++;
            prev = 0;
        }else{
            oddLen++;
            alter++;
            prev = 1;
        }
        for(int i = 1;i<n;i++){
             if(nums[i]%2 == 0){
                evenLen++;
                if(prev == 1){
                    alter++;
                    prev = 1-prev;
                }
             }else{
                oddLen++;
                if(prev == 0){
                     alter++;
                     prev = 1-prev;
                }
             }
        }
        return Math.max(alter , Math.max(oddLen , evenLen));
    }
}