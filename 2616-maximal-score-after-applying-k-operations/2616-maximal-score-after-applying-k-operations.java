class Solution {
    public long maxKelements(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i : nums){
            pq.add(i);
        }
        int n = nums.length;
        long score = 0;
        for(int i = 0;i<k;i++){
            int max = pq.poll();
            score+=max;
            int newE = (int)Math.ceil(max/3.0);
            pq.add(newE);
        }
       return score; 
    }
} 