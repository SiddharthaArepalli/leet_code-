class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long swapC = 0;
        int ls = 0;
        for(int c = 0;c<n;c++){
            if(s.charAt(c) == '0'){
                swapC+=(c-ls);
                ls++;
            }
        }
        return swapC;
    }
}