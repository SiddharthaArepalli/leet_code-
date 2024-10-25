class Solution {
    public List<String> removeSubfolders(String[] folder) {
        int n = folder.length;
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        // String prev ="";
        for(String s : folder){
            if(ans.isEmpty() || !s.startsWith(ans.get(ans.size() - 1) + "/")){
                ans.add(s);
                // prev = s;
            }
        }
        return ans;
    }
}