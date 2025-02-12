class Solution {
    public int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
         int n = nums.length;
         int dSum[] = new int[n];
         for(int i = 0;i<n;i++){
            dSum[i] = digitSum(nums[i]);
         }
         HashMap<Integer,List<Integer>> hm = new HashMap<>();
         for(int num : nums){
            int ds = digitSum(num);
            hm.putIfAbsent(ds, new ArrayList<>());
            hm.get(ds).add(num);
         }
         System.out.println(hm);
         int maxSum = Integer.MIN_VALUE;
         for(List<Integer> values : hm.values()){
                if(values.size()<2){
                    continue;
                }
                int curMax = 0;
                int f = Collections.max(values);
                values.remove(Integer.valueOf(f));
                int s = Collections.max(values);
                curMax = f+s;
                maxSum = Math.max(curMax, maxSum);
         }
        return maxSum==Integer.MIN_VALUE?-1:maxSum;   
    }
}