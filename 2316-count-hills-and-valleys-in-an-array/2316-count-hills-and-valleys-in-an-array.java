class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        List<Integer> ar = new ArrayList<>();
        ar.add(nums[0]);
        for(int i = 1;i<n;i++){
           if(nums[i]!= nums[i-1]){
               ar.add(nums[i]);
           }
        }
        if(nums[n-2]!=nums[n-1]) ar.add(nums[n-1]);
        int count = 0;
        for(int i = 1;i<ar.size()-1;i++){
            if((ar.get(i) < ar.get(i+1) && ar.get(i)<ar.get(i-1)) || (ar.get(i) > ar.get(i-1) && ar.get(i)>ar.get(i+1)) ){
               count++;
            }
        }
        return count;
    }
}