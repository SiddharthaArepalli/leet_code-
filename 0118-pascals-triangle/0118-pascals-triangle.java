class Solution {
    public List<List<Integer>> generate(int numRows) {
          int n = numRows;
          List<List<Integer>> res = new ArrayList<>();
          for(int i = 0;i<n;i++){
              List<Integer> ls = new ArrayList<>();
              for(int j = 0;j<i+1;j++){
                   if(j == 0){
                      ls.add(1);
                   }
                   else if(j == i){
                       ls.add(1);
                   }else{
                       if(i > 0){
                           int s = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                           ls.add(s);
                       }
                   }
              }
              res.add(ls);
          }
          return res;
    }
}