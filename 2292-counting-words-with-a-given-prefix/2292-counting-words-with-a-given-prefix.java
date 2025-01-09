class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int c = 0;
        for(String word : words){
            if(word.startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}