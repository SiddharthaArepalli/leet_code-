class Solution {
    public static void cbSum(int cand[] , int tar , List<List<Integer>> res , List<Integer> cur , int ind){
            int n = cand.length;
            if(ind == n || tar<0) return;
            if(tar == 0) {
                res.add(new ArrayList<>(cur));
                return;
            }
            cur.add(cand[ind]);
            // cbSum(cand , tar-cand[ind] , res , cur ,ind+1);
            cbSum(cand , tar-cand[ind] , res , cur,  ind);
            cur.remove(cur.size()-1);
            cbSum(cand , tar , res , cur , ind+1);
    }
    public List<List<Integer>> combinationSum(int[] cand, int tar) {
        List<List<Integer>> res = new ArrayList<>();
        cbSum(cand , tar ,res , new ArrayList<>() , 0);
        return res;
    }
}