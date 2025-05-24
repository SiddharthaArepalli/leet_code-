class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int n = words.length;
        for(int i = 0;i<n;i++){
             int b = words[i].indexOf(x);
             if(b!=-1) res.add(i);
        }
        return res;
    }
}