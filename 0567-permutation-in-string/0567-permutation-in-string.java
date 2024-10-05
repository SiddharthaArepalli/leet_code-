class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(int i = 0;i<l1;i++){
            char c = s1.charAt(i);
            hm1.put(c, hm1.getOrDefault(c, 0)+1);
        }
        HashMap<Character, Integer> wF = new HashMap<>();
        for(int i = 0;i<l1;i++){
            char c = s2.charAt(i);
            wF.put(c, wF.getOrDefault(c, 0)+1);
        }
        
        if(hm1.equals(wF)){
            return true;
        }

        for(int i = l1;i<l2;i++){
            char ic = s2.charAt(i);
            wF.put(ic, wF.getOrDefault(ic, 0)+1);
            char oc = s2.charAt(i - l1);
            if(wF.get(oc) == 1){
                wF.remove(oc);
            }else {
                wF.put(oc, wF.get(oc) - 1);
            }
            if(hm1.equals(wF)){
                return true;
            }

        }
        return false;
    }
}