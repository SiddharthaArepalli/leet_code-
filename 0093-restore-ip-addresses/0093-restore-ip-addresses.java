class Solution {
    public static boolean checkValid(String s){
         if(s.length() == 0 || s.length()>3) return false;
         if (s.charAt(0) == '0' && s.length() > 1) return false;
         int n = Integer.parseInt(s);
         if(n<0 || n>255) return false;
         return true;
    }

    public static void restIp(String s , List<String> path , List<String> res , int st){

        if (path.size() == 4) {
            if (st == s.length()) {
                res.add(String.join(".", path));
            }
            return;
        }        
        
        for(int i  = 1 ; i<=3 && st+i<=s.length(); i++){
             String part = s.substring(st , st+i);
             if(checkValid(part)){
                 path.add(part);
                 restIp(s , path ,res , st+i);
                 path.remove(path.size()-1);
             }
        }
   
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList();
        if(s.length() < 4 || s.length() > 12 ) return res;
        restIp(s , new ArrayList<>(),res , 0);
        return res;
    }
}