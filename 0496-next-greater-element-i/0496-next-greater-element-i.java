class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums2.length;i++){
                hm.put(nums2[i], i);
        }
        int res[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int t = hm.get(nums1[i]);
            int max = -1;
            for(int j = t+1;j<nums2.length;j++){
                if(nums2[j] > nums1[i]){
                    max = nums2[j];
                    break;
                }
            }
            res[i] = max;
        }
        return res;
    }
}