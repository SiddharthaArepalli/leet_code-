class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int maxSeen = -1;
        int c = 0;
        for(int i = 0;i<n;i++){
            maxSeen = Math.max(maxSeen , arr[i]);
            if(maxSeen == i){
                c++;
                maxSeen = -1;
            }
        }    
        return c;
    }
}