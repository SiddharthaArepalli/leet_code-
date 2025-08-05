class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int vis[] = new int[m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(baskets[j]>= fruits[i] && vis[j]!=1){
                      vis[j] = 1;
                      break;
                }
            }
        }
        int c = 0;
        for(int i = 0;i<m;i++){
             if(vis[i] == 0) c++;
        }
        return c;
    }
}