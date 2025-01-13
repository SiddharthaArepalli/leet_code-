class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int delCount = 0;
        for(int i : hm.values()){
            if(i%2 == 0){
                delCount+=i-2;
            }else{
                delCount+=i-1;
            }
        }
        return s.length()-delCount;
    }
}