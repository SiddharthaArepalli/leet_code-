class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c!='*'){
                st.push(c);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}