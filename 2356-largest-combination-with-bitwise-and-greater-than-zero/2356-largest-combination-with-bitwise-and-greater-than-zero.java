class Solution {
    public int largestCombination(int[] candidates) {
        int bit[] = new int[31];
        for(int i = 0;i<31;i++){
            for(int n : candidates){
                if((n&(1<<i))!=0){
                    bit[i]++;
                }
            }
        }
        int max = 0;
        for(int c : bit){
            if(c>max){
                max = c;
            }
        }
        return max;
    }
}