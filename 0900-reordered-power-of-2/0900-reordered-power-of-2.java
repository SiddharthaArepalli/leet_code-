class Solution {
    public static boolean ptwo(int n){
          int y = 1;
          if(n == 1) return true;
          while(y < n){
              y = y<<1;
              if(y == n){
                  return true;
              }
          }
          return false;
    }


    public void per(String s , StringBuilder sb , int vis[] , List<Integer> ls){
        if(sb.length() == s.length()){
            if (sb.charAt(0) == '0') return;
            int n = Integer.parseInt(sb.toString());
            ls.add(n);
            return;
        }

        for(int i = 0;i<s.length();i++){
            if(vis[i] == 0){
                vis[i] = 1;
                sb.append(s.charAt(i));
                per(s , sb , vis , ls);
                sb.deleteCharAt(sb.length()-1);
                vis[i] = 0;
            }
        }
    }
    public boolean reorderedPowerOf2(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int vis[] = new int[s.length()];
        List<Integer> ls = new ArrayList<>();
        per(s,sb,vis,ls);
        for(int i : ls){
             if(ptwo(i)){
                 return true;
             }
        }
        return false;
    }
}