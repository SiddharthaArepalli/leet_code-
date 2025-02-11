class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            char c = s.charAt(i);
            st.push(c);
            if(st.size()>=m){
                 for(int j = 0;j<m;j++){
                       sb.append(st.pop());
                 }
                 sb.reverse();
                if(!sb.toString().equals(part)){
                    for (char ch : sb.toString().toCharArray()) {
                        st.push(ch);
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(Character c : st){
            res.append(c);
        }

        return res.toString();
    }
}