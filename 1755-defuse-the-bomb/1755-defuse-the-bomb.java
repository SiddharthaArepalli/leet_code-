class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            if(k == 0){
                res[i] = 0;
            }
            else if (k > 0){
                int sum = 0;
                for(int j = 1; j<=k;j++){
                    sum+=code[(i+j)%n];
                }
                res[i] = sum;
            }
            else{
                int sum = 0;
                for(int s = 1; s<=-k;s++){
                    sum+=code[(n+i-s)%n];
                }
                res[i] = sum;
            }
        }
        return res;
    }
}