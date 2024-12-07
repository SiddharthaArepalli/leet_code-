class Solution {
        public static int countSolders(int[] row){
            int n = row.length;
            int l = 0;
            int r = n;
            while(l<r){
                int mid = l+(r-l)/2;
                if(row[mid]==1){
                    l = mid+1;
                }
                else{
                    r = mid;
                }
            }
            return l;
        }
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
             (a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return Integer.compare(a.getValue(), b.getValue());
                } else {
                    return Integer.compare(a.getKey(), b.getKey());
                }
            }
        );
        Map<Integer, Integer> indexToValue = new HashMap<>();
        int id = 0;
        for(int i = 0;i<m;i++){
            // int count = 0;
            // for(int j = 0;j<n;j++){
            //     if(mat[i][j] == 1){
            //       count++;
            //     }
            //     else{
            //         break;
            //     }
            // }
            int count = countSolders(mat[i]);
             indexToValue.put(i,count);

        }
        minHeap.addAll(indexToValue.entrySet());
        for(int i = 0;i<k;i++){
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
}