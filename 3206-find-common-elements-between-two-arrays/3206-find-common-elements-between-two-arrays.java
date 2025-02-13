class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int num : nums1){
             hs1.add(num);
        }
        for(int num  : nums2){
            hs2.add(num);
        }
        int res[] = new int[2];
        int c1 = 0, c2 = 0;
        for(int num : nums1){
            if(hs2.contains(num)){
                 c1++;
            }
        }
        for(int num : nums2){
            if(hs1.contains(num)){
                 c2++;
            }
        }
        res[0]=c1;
        res[1]=c2;
        return res;
    }
}