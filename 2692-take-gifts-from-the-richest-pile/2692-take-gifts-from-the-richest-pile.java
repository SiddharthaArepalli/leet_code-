class Solution {
    public long pickGifts(int[] gifts, int k) {
        // int n = gifts.length;
        // long totalSum = 0;
        // while(k-- > 0){
        //     Arrays.sort(gifts);
        //     gifts[n-1] = (int)Math.sqrt(gifts[n-1]);
        // }
        // for(int i = 0;i<n;i++){
        //     totalSum+=gifts[i];
        // }
        // return totalSum;
        PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder()); 
        // maxheap remember this one sid !
        long sum = 0;
        for(int val : gifts){
            mh.add(val);
        }
        for(int i = 0;i<k;i++){
            mh.add((int)Math.sqrt(mh.poll()));
        }
        for(int val : mh){
            sum+=val;
        }
        return sum;
    }
}