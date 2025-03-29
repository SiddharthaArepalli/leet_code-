class Solution {
    public int reverseDegree(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();
        int k = 26;
        for(char c = 'a' ; c<='z';c++){
            hm.put(c,k--);
        }
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            sum+=(hm.getOrDefault(s.charAt(i),0)*(i+1));
        }
        return sum;
    }
}