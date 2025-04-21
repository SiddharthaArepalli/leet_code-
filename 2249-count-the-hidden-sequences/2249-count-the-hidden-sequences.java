class Solution {
    public int numberOfArrays(int[] dif, int l, int u) {
        int n = dif.length;
        int[] pref = new int[n + 1];
        pref[0] = 0;
        long prefMax = 0;
        long prefMin = 0;
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + dif[i];
            prefMax = Math.max(prefMax, pref[i + 1]);
            prefMin = Math.min(prefMin, pref[i + 1]);
        }
        long h = u - prefMax;
        long lo = l - prefMin;
        if (h < lo) {
            return 0;
        }
        return (int)(h - lo + 1);
    }
}