class Solution {
    public static boolean validate(int nums[], long m , int c){
         long count = 0;
         for(int i = 0;i<nums.length;i++){
            count+=(Math.sqrt(m/nums[i]));
         }
         return count>=c;
    }
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long minRank = Integer.MAX_VALUE;
        for(int i : ranks){
            minRank = Math.min(minRank, i);
        }
        long l = 1;
        long h = (minRank)*((long)Math.pow(cars,2));
        long ans = 1;
        while(l<=h){
            long m = l+(h-l)/2;
            if(validate(ranks,m,cars)){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
}