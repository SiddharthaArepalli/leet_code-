class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int n = nums.length;
        // double maxAvg = Integer.MIN_VALUE;
        // for(int i = 0;i<n-k+1;i++){
        //     double sum = 0;
        //     double avg = 0;
        //      for(int j = i;j<i+k;j++){
        //          sum+=nums[j];
        //      }
        //      avg = (double)sum/k;
        //      if(avg > maxAvg){
        //         maxAvg = avg;
        //      }
        // }
        // return maxAvg;

        double max=Integer.MIN_VALUE;
        double sum=0;
        int start=0;
        for(int end=0;end<nums.length;end++){
            sum=sum+nums[end];
            if(end-start+1==k){
              max=Math.max(max,sum/k);
              sum=sum-nums[start];
              start++;
            }
        }
        return max;
    }
}