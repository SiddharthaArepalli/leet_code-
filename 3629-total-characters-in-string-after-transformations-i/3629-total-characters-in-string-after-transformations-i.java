class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1000000007;
        int feq[] = new int[26];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            feq[c-'a']++;
        }
        while(t-- > 0){
            int cf[] = new int[26];
            for(int i = 0;i<26;i++){
                char cc = (char)(s.charAt(i));
                for(i = 0;i<25;i++){
                    cf[i+1] = (cf[i+1]+feq[i])%mod;
                }
                cf[0] = (cf[0]+feq[25])%mod;
                cf[1] = (cf[1]+feq[25])%mod;
            }
            feq = cf;
        }
        int len = 0;
        for(int i = 0;i<26;i++){
            len= (len + feq[i])%mod;
        }
        return len;
    }
}