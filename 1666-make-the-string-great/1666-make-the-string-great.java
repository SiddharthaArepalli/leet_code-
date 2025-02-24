class Solution {
    public String makeGood(String s) {
         int n = s.length();
         Stack<Character> st = new Stack<>();
         for(int i = 0;i<n;i++){
             if(!st.isEmpty() && s.charAt(i) == (char)(st.peek()^32)){
                st.pop();
             }
            // else if(!st.isEmpty() && s.charAt(i) == Character.toLowerCase(st.peek())){
            //     st.pop();
            //  }
              else{
                st.push(s.charAt(i));
             }
         }
         StringBuilder sb = new StringBuilder();
         for(Character c : st){
             sb.append(c);
         }
         return sb.toString();
    }
}