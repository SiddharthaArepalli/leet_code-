class Solution {
    public boolean isSubsequence(String s, String t) {
         int n1 = s.length();
         int n2 = t.length();
         int i = 0;
         int j = 0;
         int count = 0;
         while(i<n1 && j<n2){
             if(s.charAt(i) == t.charAt(j)){
                 count++;
                 i++;
                 j++;
             }else{
                 j++;
             }
         }
         return count==n1;
    }
}