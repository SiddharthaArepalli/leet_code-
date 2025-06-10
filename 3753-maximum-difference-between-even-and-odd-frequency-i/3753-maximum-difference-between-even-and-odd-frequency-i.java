class Solution {
    public int maxDifference(String s) {
       HashMap<Character , Integer> hm = new HashMap<>();
       for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c , 0)+1);
       }
       int odFeq = Integer.MIN_VALUE;
       int evFeq = Integer.MAX_VALUE;
       for(int i : hm.values()){
            if(i%2 == 0){
                evFeq = Math.min(evFeq , i);
            }else{
                odFeq = Math.max(odFeq , i);
            }
       }
        return odFeq-evFeq;
    }
}