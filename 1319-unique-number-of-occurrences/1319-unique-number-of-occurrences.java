class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
       HashSet<Integer> hs = new HashSet<>();
       for(int num : hm.values()){
            hs.add(num);
       }
        return hm.size()==hs.size();
    }
}