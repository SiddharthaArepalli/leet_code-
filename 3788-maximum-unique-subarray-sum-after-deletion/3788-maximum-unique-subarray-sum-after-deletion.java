class Solution {
    public int maxSum(int[] nums) {
          int n = nums.length;
          Arrays.sort(nums);
          int sum = 0;
          if(nums[n-1] < 0) return nums[n-1];
          HashSet<Integer> hs = new HashSet<>();
          for(int i = n-1;i>=0;i--){
            if(!hs.contains(nums[i])){
                if(nums[i]<0) continue;
                sum+=nums[i];
                hs.add(nums[i]);
            }
          }
          return sum;
    }
}