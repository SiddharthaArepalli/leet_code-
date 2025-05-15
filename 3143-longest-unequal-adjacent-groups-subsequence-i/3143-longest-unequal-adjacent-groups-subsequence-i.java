class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> ls = new ArrayList<>();
        if(n == 0){
            return ls;
        }
        ls.add(words[0]);
        int prev = groups[0];
        for(int i = 1;i<n;i++){
             if(prev!=groups[i]){
                 ls.add(words[i]);
                 prev = groups[i];
             }
        }
        return ls;
    }
}