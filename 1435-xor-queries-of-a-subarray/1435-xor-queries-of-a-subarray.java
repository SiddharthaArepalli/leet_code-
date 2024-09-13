class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
     int n = queries.length;
        int[] res = new int[n];
        int[] prefixXor = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }
        for (int i = 0; i < n; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = prefixXor[r + 1] ^ prefixXor[l];
        }
        return res;
    }
}