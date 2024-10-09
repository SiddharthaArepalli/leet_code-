class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int bs = 0;
        int res = 0;
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c == '('){
                bs++;
            }
            else if (bs<=0){
                res++;
            }
            else{
                bs--;
            }
        }
        return res+bs;
    }
}