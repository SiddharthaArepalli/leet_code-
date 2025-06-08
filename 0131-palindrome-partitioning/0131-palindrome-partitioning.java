class Solution {
    
    public static boolean isPal(String s){
         StringBuilder sb = new StringBuilder(s);
         return sb.reverse().toString().equals(s);
    }

    public static void getAllPars(String s , List<List<String>> res , List<String> ls){
        int n = s.length();
        if(s.length() == 0){
             res.add(new ArrayList<>(ls));
             return;
        }
        for(int i = 0;i<n;i++){
            String p = s.substring(0,i+1);
            if(isPal(p)){
                ls.add(p);
                getAllPars(s.substring(i+1) , res , ls );
                ls.remove(ls.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
         List<List<String>> res = new ArrayList<>();
         getAllPars(s , res , new ArrayList<>() );
         return res;
    }
}