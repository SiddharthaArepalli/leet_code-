class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int num : nums){
            al.add(num);
        }
        List<List<Integer>> ls = new ArrayList<>();
        // HashMap<Integer,Integer> hm = new HashMap<>();
        while(!al.isEmpty()){
            HashSet<Integer> hs = new HashSet<>();
            List<Integer> cur = new ArrayList<>();
            List<Integer> rem = new ArrayList<>();
            for(int i = 0;i<al.size();i++){
                int n = al.get(i);
                if(!hs.contains(n)){
                    hs.add(n);
                    cur.add(n);
                }
                else{
                    rem.add(n);
                }
            }
            al = rem;
            ls.add(cur);
        }
        return ls;
    }
}