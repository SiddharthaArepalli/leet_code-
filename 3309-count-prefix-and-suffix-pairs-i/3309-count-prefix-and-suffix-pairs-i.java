class Solution {
    public static boolean isPrefixAndSuffix(String word1 , String word2){
        return (word1.startsWith(word2) && word1.endsWith(word2));
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int c  = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                 if(isPrefixAndSuffix(words[j] ,words[i])){
                    c++;
                 }
            }
        }
        return c;
    }
}