class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n = s.length();
        int maxVow = 0;
        int cur = 0;
        for(int i = 0;i<k;i++){
             char c = s.charAt(i);
             if(hs.contains(c)){
                cur++;
             }
        }
         maxVow = cur;
        for(int i = k;i<n;i++){
             char c = s.charAt(i);
             char cc = s.charAt(i-k);
             if(hs.contains(c)){
                  cur++;
             }
             if(hs.contains(cc)){
                cur--;
             }
            maxVow = Math.max(cur, maxVow);
        }
      return maxVow;
    }
}