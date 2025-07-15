class Solution {
    public boolean isValid(String word) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        int v = 0;
        int c = 0;
        if(word.length()<3){
            return false;
        }
        for(char cc : word.toCharArray()){
            if(!Character.isLetterOrDigit(cc)){
                 return false;
            }
            if(hs.contains(cc)){
                 v++;
            }
            if(Character.isLetter(cc) && !hs.contains(cc)){
                c++;
            }
        }
        return  v >= 1 && c >= 1;
    }
}