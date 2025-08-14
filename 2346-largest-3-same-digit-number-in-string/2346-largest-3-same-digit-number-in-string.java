class Solution {
    public boolean isSame(String s){
        char c = s.charAt(0);
         for(int i = 1;i<3;i++){
             if(s.charAt(i)!=c){
                  return false;
             }
         }
         return true;
    }
    public String largestGoodInteger(String num) {
        int n = num.length();
        String ss = "";
        boolean f = false;
        for(int i = 0;i<n-2;i++){
             String s = num.substring(i,i+3);
             if(isSame(s)){
                  if(s.compareTo(ss) > 0) ss = s;
             }
        }
        return ss;
    }
}