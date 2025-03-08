class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int w = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<k;i++){
            char c = blocks.charAt(i);
            if(c == 'W'){
                w++;
            }
        }
        min = w;
        for(int i = k;i<n;i++){
            char c = blocks.charAt(i);
            if(c == 'W'){
                w++;
            }
            if(blocks.charAt(i-k) == 'W'){
                w--;
            }
            if(w <= min){
                min = w;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}