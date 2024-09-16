class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String s : sentences){
           int count = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == ' '){
                    count++;
                }
                if(count> maxCount){
                    maxCount = count;
                }
            }
        }
        return maxCount+1;
    }
}