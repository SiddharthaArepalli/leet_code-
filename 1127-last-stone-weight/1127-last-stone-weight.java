class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<n;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1!= s2){
                pq.offer(s1-s2);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}