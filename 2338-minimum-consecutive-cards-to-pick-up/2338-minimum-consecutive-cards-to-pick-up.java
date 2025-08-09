class Solution {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        int minLen = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!hm.containsKey(cards[i])){
                hm.put(cards[i] , i);
            }
            else{
                minLen = Math.min(i-hm.get(cards[i])+1, minLen);
                hm.put(cards[i] ,i);
            }
        }
        return minLen == Integer.MAX_VALUE?-1:minLen;
    }
}