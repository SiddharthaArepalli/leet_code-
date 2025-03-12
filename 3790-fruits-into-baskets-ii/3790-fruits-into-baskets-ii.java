class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = f.length;
        int placed[] = new int[n];
        int p = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(f[i]<=b[j] && placed[j]!=1){
                    p++;
                    placed[j] = 1;
                    break;
                }
            }
        }
        return n-p;
    }
}