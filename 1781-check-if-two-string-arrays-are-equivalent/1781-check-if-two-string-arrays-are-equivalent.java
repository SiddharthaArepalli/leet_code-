class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        for(String s : word1){
            w1+=s;
        }
        System.out.println(w1);
        String w2 = "";
        for(String ss : word2){
            w2+=ss;
        }
        System.out.println(w2);
        if(w1.compareTo(w2) == 0){
            return true;
        }
        return false;
    }
}