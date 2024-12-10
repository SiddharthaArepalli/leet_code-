class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        HashMap<String ,Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i;j<n;j++){
                 if(sb.length() == 0 || s.charAt(j) ==sb.charAt(sb.length()-1)){
                    sb.append(s.charAt(j));
                    hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
                 }
                 else{
                    break;
                 }
            }
        }
        int ans = 0;
        for(String st : hm.keySet()){
            if(hm.get(st)>=3 && st.length()>ans){
                ans = st.length();
            }
        }
            if(ans == 0){
                return -1;
            }
            return ans;
    }
}