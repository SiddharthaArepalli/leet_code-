class Solution {
    public boolean check(int[][] rectangles,int sw){
        int coordinateGap = 0;
        Arrays.sort(rectangles,(a,b)->a[sw]-b[sw]);
        int end = rectangles[0][sw+2];
        for(int i = 1;i<rectangles.length;i++){
            if(end<=rectangles[i][sw]) coordinateGap++;
            end = Math.max(end,rectangles[i][sw+2]);
        }
        return coordinateGap>=2;
    }
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return check(rectangles,0) || check(rectangles,1);
    }
}