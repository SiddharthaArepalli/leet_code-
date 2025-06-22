class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int e = n%k;
        int j = 0;
        int g = e!=0?(n/k)+1:(n/k);
        String res[] = new String[g];
        for(int i = 0;i<n-e;i+=k){
            String ss = s.substring(i,i+k);
            res[j++] = ss;
        }
        StringBuilder sb = new StringBuilder(s.substring(n-e,n));
        if(e!=0){
            for(int i = 0;i<k-e;i++){
                sb.append(fill);
            }
            res[j] = sb.toString();
        }
        return res;
    }
}