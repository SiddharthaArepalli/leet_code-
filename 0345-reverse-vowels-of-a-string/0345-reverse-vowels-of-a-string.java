class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(hs.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        StringBuilder rev = new StringBuilder();
        int ind = 0;
        for(int i = 0;i<n;i++){
            if(hs.contains(s.charAt(i))){
                rev.append(sb.charAt(ind++));
            }else{
                rev.append(s.charAt(i));
            }
        }
        return rev.toString();
        
    }
}