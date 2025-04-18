class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1;i<n;i++){
            res = buildStr(res);
        }
        return res;
    }
    public static String buildStr(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length()-1));
        return sb.toString();
    }
}