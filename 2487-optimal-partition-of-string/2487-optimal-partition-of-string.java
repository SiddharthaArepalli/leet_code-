class Solution {
    public int partitionString(String s) {
        int n = s.length();
        int r = 0;
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        while(r<n){
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
                r++;
            }else{
                count++;
                hs = new HashSet<>();
            }
        }
        return count+1;
    }
}