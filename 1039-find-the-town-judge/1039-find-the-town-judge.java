class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        if(n == 1) return 1;
        for(int i = 0;i<trust.length;i++){
           int a = trust[i][0] , b = trust[i][1];
           hm1.put(a , b);
           hm2.put(b , hm2.getOrDefault(b,0)+1);
        }
        for(int i : hm2.keySet()){
              if((hm2.get(i) == n-1) && !hm1.containsKey(i)){
                 return i;
              }
        }
        return -1;
    }
}