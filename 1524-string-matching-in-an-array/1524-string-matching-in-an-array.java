class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        int n = words.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i!=j && words[i].contains(words[j])){
                    set.add(words[j]);
                }
            }
        }
        List<String> res = new ArrayList<>(set);
        return res;
    }
}