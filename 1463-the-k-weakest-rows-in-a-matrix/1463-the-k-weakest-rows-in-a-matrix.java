class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[k];
        Map<Integer, Integer> indexToValue = new HashMap<>();
        int id = 0;
        for(int i = 0;i<m;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 1){
                  count++;
                }
                else{
                    break;
                }
            }
            indexToValue.put(i,count);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
             (a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return Integer.compare(a.getValue(), b.getValue());
                } else {
                    return Integer.compare(a.getKey(), b.getKey());
                }
            }
        );
        minHeap.addAll(indexToValue.entrySet());
        for(int i = 0;i<k;i++){
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
}