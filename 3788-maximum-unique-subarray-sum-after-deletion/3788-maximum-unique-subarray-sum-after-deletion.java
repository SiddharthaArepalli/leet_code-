class Solution {
    public int maxSum(int[] a) {
        int n = a.length;
        Set<Integer> s = new HashSet<>();
        int l = 0, r = 0, sum = 0, max = Integer.MIN_VALUE;
        boolean allNeg = true;
        int maxNeg = Integer.MIN_VALUE;
        for (int num : a) {
            if (num >= 0) allNeg = false;
            maxNeg = Math.max(maxNeg, num);
        }
        if (allNeg) return maxNeg;
        HashSet<Integer> hs = new HashSet<>();
        int sumS = 0;
        for(int i =0;i<n;i++){
            if(!hs.contains(a[i]) && a[i]>0){
                hs.add(a[i]);
                sumS+=a[i];
            }
        }
        return sumS;
    }
}