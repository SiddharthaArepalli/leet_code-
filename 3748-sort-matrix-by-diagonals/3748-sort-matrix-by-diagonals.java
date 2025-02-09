class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        HashMap<Integer , List<Integer>> hm = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int k = i-j;
                hm.putIfAbsent(k,new ArrayList<>());
                hm.get(k).add(grid[i][j]);
            }
        }

        for(Map.Entry<Integer, List<Integer>> entry : hm.entrySet()){
            List<Integer> values = entry.getValue();
            if(entry.getKey()<0){
                Collections.sort(values);
            }
            else{
                values.sort(Collections.reverseOrder());
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = hm.get(i-j).remove(0);
            }
        }
        return grid;
    }
}