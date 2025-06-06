class Solution {
    public String robotWithString(String s) {
          int n = s.length();
          Stack<Character> st = new Stack<>();
          StringBuilder res = new StringBuilder();
          char sMin[] = new char[n];
          sMin[n-1] = s.charAt(n-1);
          for(int i = n-2 ; i>=0;i--){
              sMin[i] = (char)Math.min(s.charAt(i),sMin[i+1]);
          }
          for(int i = 0;i<s.length();i++){
              st.push(s.charAt(i));
              while(!st.isEmpty() && ( i == (n-1) ||   st.peek() <= sMin[i+1])){
                  res.append(st.pop());
              }
          }
          while(!st.isEmpty()){
             res.append(st.pop());
          }
          return res.toString();
    }
}