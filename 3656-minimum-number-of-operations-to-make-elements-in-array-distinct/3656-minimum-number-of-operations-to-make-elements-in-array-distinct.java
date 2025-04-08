class Solution {
   
    public int minimumOperations(int[] nums){
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int c = 0;
        for(int i = n-1;i>=0;i--){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                c++;
            }
            else{
                break;
            }
        }
        int rem = n-c;
        int res = rem%3==0?rem/3:(rem/3)+1;
        return res;

    }
}