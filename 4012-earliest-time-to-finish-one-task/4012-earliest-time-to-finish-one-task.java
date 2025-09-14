class Solution {
    public int earliestTime(int[][] tasks) {
        int minT = Integer.MAX_VALUE;
        for(int [] task : tasks){
            minT = Math.min((task[0]+task[1]) , minT);
        }
        return minT;
    }
}