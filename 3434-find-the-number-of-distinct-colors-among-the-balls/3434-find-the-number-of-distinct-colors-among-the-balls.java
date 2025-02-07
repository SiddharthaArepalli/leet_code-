class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> cf = new HashMap<>();
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            int b = queries[i][0];
            int c = queries[i][1];
            if(hm.containsKey(b)){
                 cf.put(hm.get(b),cf.get(hm.get(b))-1);
            }
            if(hm.containsKey(b) && cf.get(hm.get(b))==0){
                cf.remove(hm.get(b));
            }
            hm.put(b,c);
            cf.put(c,cf.getOrDefault(c,0)+1);
            res[i] = cf.size();
        }
        return res;
    }
}