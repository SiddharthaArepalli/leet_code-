class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int pref[] = new int[words.length];
         HashSet<Character> v = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
        );
        int sum = 0;
        int i = 0;
        for(String word : words){
            if( v.contains(word.charAt(0)) && v.contains(word.charAt(word.length()-1))){
                sum++;
            }
            pref[i++] = sum;
        }
        int f = 0;
        int res[] = new int[queries.length];
        for(int[] query : queries){
             int s = query[0];
             int l = query[1];
             if(s == 0){
                res[f++] = pref[l];
             }else{
                res[f++] = pref[l] - pref[s-1];
             }
        }
        return res;
    }
}