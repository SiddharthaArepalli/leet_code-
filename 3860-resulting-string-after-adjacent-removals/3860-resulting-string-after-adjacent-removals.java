class Solution {
    public String resultingString(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<n;i++){
            char c = s.charAt(i);
            char t = ' ';
            if (!st.isEmpty()) t = st.peek();
            if(c == ((int)t)-1 || c == ((int)t)+1 || ( c == 'z' && t == 'a') || ( c == 'a' && t == 'z') ){
                 st.pop();
            }
            else{
                 st.push(s.charAt(i));
            }
        }
        for(char c : st){
             sb.append(c);
        }
        return sb.toString();
    }
}