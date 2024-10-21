class Solution {
    int maxCount = 0;

    public int maxUniqueSplit(String s) {
        maxCount = 0;
        HashSet<String> hs = new HashSet<>();
        backtrack(s,hs,0);
        return maxCount;
    }

    public void backtrack(String s , HashSet<String> set, int index){
        int l = s.length();
        if(index == s.length()){
            maxCount = Math.max(maxCount,set.size());
            return;
        }
        for(int i = index;i<l;i++){
            String sub = s.substring(index , i+1);
            if(!set.contains(sub)){
                set.add(sub);
                backtrack(s, set, i+1);
                set.remove(sub);
            }
        }
    }
}