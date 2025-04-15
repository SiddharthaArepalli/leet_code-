class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int res[] = new int[n-k+1];
        int s = 0;
        for(int i = 0;i<=k-1;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        res[s++] = nums[dq.peekFirst()];
        for(int i = k;i<n;i++){
            if(dq.peekFirst() <= i - k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
            res[s++] = nums[dq.peekFirst()];
        }
        return res;
    }
}