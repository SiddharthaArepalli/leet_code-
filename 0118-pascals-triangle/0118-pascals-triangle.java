class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<n;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                if(j==0 || j == i){
                     ls.add(1);
                }else{
                    int v = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    ls.add(v);
                }
            }
            res.add(ls);
        }
        return res;
    }
}