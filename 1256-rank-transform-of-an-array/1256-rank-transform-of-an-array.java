class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int cop[] = arr.clone();
        Arrays.sort(cop);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for(int i : cop){
            if(!hm.containsKey(i)){
                hm.put(i, rank);
                rank++;
            }
        }
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = hm.get(arr[i]);
        }
        return res;
    }
}