class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int mis = 0;
        for(int i = 0;i<n1;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                mis++;
                hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),0)+1);
                hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i),0)+1);
            }
            if(mis>2){
                return false;
            }
        }
       return hm1.equals(hm2);
    }
}