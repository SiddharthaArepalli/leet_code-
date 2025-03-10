class Solution {
    public static boolean isV(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public long countOfSubstrings(String w, int k) {
        int n = w.length();
        long count = 0;
        long con = 0;
        int pre[] = new int[n];
        int ind = n;
        for(int i = n-1;i>=0;i--){
            pre[i] = ind;
            if(!isV(w.charAt(i))){
                ind = i;
            }
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int p = -1;
        while(j<n){
            char nC = w.charAt(j);
            if(p!=j){
                if(isV(nC)){
                    hm.put(nC,hm.getOrDefault(nC,0)+1);
                }
                else{
                    con++;
                }
                p = j;
            }
            if(j >= (5+k-1)){
                if(con == k && hm.size() == 5){
                    count+=(pre[j]-j);
                }
                if((hm.size() == 5 && con == k) || con > k){
                    char fC = w.charAt(i);
                    if(isV(fC)){
                        hm.put(fC , hm.get(fC)-1);
                        if(hm.get(fC) == 0){
                            hm.remove(fC);
                        }
                    }else{
                        con--;
                    }
                    i++;
                }else
                    j++;
                }else
                    j++;
        }
        return count;
    }
}