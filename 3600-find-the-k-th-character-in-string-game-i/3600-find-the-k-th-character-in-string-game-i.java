class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(s.length() <= k){
            String prev = s;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<prev.length();i++){
                if(s.charAt(i) == 'z'){
                    sb.append('a');
                }else{
                    sb.append((char)(s.charAt(i)+1));
                }
            }
            s = prev +sb.toString();
        }
        return s.charAt(k-1);
    }
}