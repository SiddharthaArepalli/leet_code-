class Solution {
    public int numberOfSubstrings(String s) {
         int n = s.length();
         int i = 0;
         int j = 0;
         HashMap<Character , Integer> hm = new HashMap<>();
         int count = 0;
         while(j<n){
             char c = s.charAt(j);
             hm.put(c,hm.getOrDefault(c,0)+1);
             while(hm.size() == 3){
                count+=(n-j);
                char f = s.charAt(i);
                hm.put(f,hm.get(f)-1);
                if(hm.get(f) == 0){
                    hm.remove(f);
                }
                i++;
             }
             j++;
         }
         return count;
    }
}