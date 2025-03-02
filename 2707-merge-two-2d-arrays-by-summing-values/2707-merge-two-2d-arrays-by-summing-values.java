class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       TreeMap<Integer,Integer> hm = new TreeMap<>();
       for(int num1[] : nums1){
            hm.put(num1[0], hm.getOrDefault(num1[0],0)+num1[1]);
       }
       for(int num2[] : nums2){
            hm.put(num2[0], hm.getOrDefault(num2[0],0)+num2[1]);
       }
       int res[][] = new int[hm.size()][2];
       int i = 0;
       for(Map.Entry<Integer,Integer> et : hm.entrySet()){
            res[i++] = new int[]{et.getKey(), et.getValue()};
       }
       return res;
    }
};