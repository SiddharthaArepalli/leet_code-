class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        int flag = 1;
        if(n == 1) return true;
        int c = 1;
        for(int i = 1;i<n;i++){
           if(s.charAt(i)==s.charAt(i-1)){
               c++;
           }
           else{
              if(c == k){
                  return true;
              }
              else{
                 c = 1;
              }
           }
        }
        return c==k?true:false;
    }
}