class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(s.length() <= k){
            StringBuilder sb = new StringBuilder(s);
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == 'z'){
                    sb.append('a');
                }else{
                    sb.append((char)(s.charAt(i)+1));
                }
            }
            s = sb.toString();
        }
        return s.charAt(k-1);
    }
}