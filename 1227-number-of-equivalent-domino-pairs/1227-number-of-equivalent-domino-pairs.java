class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int n = dom.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            int a = dom[i][0];
            int b = dom[i][1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);
            hm.put(key,hm.getOrDefault(key , 0)+1);
        }
        int ans = 0;
        for(int i : hm.keySet()){
            int count = hm.get(i);
            if(hm.get(i)>=2){
                ans+=count*(count-1)/2;
            }
        }
        return ans;
    }
}