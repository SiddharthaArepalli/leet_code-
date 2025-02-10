class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        } 
        StringBuilder sb = new StringBuilder();
        for(Character c : st){
            sb.append(c);
        }
        if(st.isEmpty()){
            return "";
        }
        else{
            return sb.toString();
        }
    }
}