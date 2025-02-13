class Solution {
    public static long oper(long x ,long y){
        return (Math.min(x,y)*2)+Math.max(x,y);
    }
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        // List<Long> ls = new ArrayList<>();
        // for(int num : nums){
        //     ls.add((long)num);
        // }
        // int count = 0;
        // while(Collections.min(ls)<k){
        //     long f = Collections.min(ls);
        //     ls.remove(Long.valueOf(f));
        //     long s = Collections.min(ls);
        //     ls.remove(Long.valueOf(s));
        //     ls.add(oper(f,s));
        //     count++;
        // }
        // return count;

        // min-heap sol 

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add((long)num);
        }

        int count = 0;
        while(pq.peek()<k){
            long f = pq.poll();
            long s = pq.poll();
            pq.add(oper(f,s));
            count++;
        }
        return count;
    }
}