class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        long sum1 = 0;
        long sum2 = 0;
        int z1 = 0;
        int z2 = 0;
        for(int i = 0;i<n;i++){
            if(nums1[i] == 0) z1++;
            sum1+=nums1[i];
        }
        for(int i = 0;i<m;i++){
            if(nums2[i] == 0) z2++;
            sum2+=nums2[i];
        }
        long m1 = sum1+z1;
        long m2 = sum2+z2;
        if(z1 == 0 && z2 == 0){
             return sum1==sum2?sum1:-1;
        }else if(z1 == 0){
            return sum1+z1<sum2+z2?-1:sum1+z1;
        }else if(z2 == 0){
            return sum1+z1>sum2+z2?-1:sum2+z2;
        }
        return Math.max(m1,m2);
    }
}