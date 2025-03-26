class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int rem = grid[0][0]%x;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]%x!=rem){
                    return -1;
                }
            }
        }
        List<Integer> ls = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ls.add(grid[i][j]);
            }
        }
        Collections.sort(ls);
        int s = ls.size();
        int med = ls.get(s/2);
        int c = 0;
        for(int i : ls){
            int r = Math.abs(i-med);
            c+=r/x;
        }
        return c;
    }
}