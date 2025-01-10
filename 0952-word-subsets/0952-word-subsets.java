class Solution {
    public static boolean allPres(String word1, HashMap<Character,Integer> mF){
        HashMap<Character, Integer> w1 = new HashMap<>();
        for(int i = 0;i<word1.length();i++){
            w1.put(word1.charAt(i), w1.getOrDefault(word1.charAt(i),0)+1);
        }
        boolean flag = true;
        for (Map.Entry<Character, Integer> entry : mF.entrySet()) {
            char c = entry.getKey();
            int requiredCount = entry.getValue();
            if (w1.getOrDefault(c, 0) < requiredCount) {
                return false;
            }
        }
        return flag;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int n1 = words1.length;
        int n2 = words2.length;
        HashMap<Character, Integer> mF = new HashMap<>();
        for(String word : words2){
           HashMap<Character, Integer> F = new HashMap<>();
           for(int i = 0;i<word.length();i++){
                char c = word.charAt(i);
                F.put(c,F.getOrDefault(c,0)+1);
           }
           for (Map.Entry<Character, Integer> entry : F.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();
                mF.put(c, Math.max(mF.getOrDefault(c, 0), count));
            }
        }
        for (String word : words1) {
            if (allPres(word, mF)) {
                res.add(word);
            }
        }
        return res;  
    }
}