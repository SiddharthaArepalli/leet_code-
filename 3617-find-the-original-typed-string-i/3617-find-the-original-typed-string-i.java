class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int c = 0;
        for(int i = 1;i<n;i++){
            if(word.charAt(i) == word.charAt(i-1)){
                c++;
            }
        }
        return c+1;
    }
}