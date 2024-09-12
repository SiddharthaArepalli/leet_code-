class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        int l = words.length;
        for(int i = 0;i<allowed.length();i++){
            hs.add(allowed.charAt(i));
        }
        int count = 0;
        for(String word : words){
            boolean con = true;
            for(int i = 0;i<word.length();i++){
                if(!hs.contains(word.charAt(i))){
                    con = false;
                    break;
                }
            }
            if(con){
                count++;
            }
        }
        return  count;
    }
}