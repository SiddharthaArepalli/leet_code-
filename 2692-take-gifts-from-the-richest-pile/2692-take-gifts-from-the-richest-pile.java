class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        long totalSum = 0;
        while(k-- > 0){
            Arrays.sort(gifts);
            gifts[n-1] = (int)Math.sqrt(gifts[n-1]);
        }
        for(int i = 0;i<n;i++){
            totalSum+=gifts[i];
        }
        return totalSum;
    }
}