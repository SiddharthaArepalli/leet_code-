class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
      int n = s.length();
        TreeMap<Character, Integer> hm = new TreeMap<>();

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        while(!hm.isEmpty()) {
            char last = hm.lastKey();
            int count = hm.get(last);
            int minCount = Math.min(count, repeatLimit);

            for(int i = 0; i < minCount; i++){
                sb.append(last);
            }

            count -= minCount;

            if(count == 0){
                hm.pollLastEntry();
            } else {
                hm.put(last, count);
            }

            if(count > 0){
                Character secLast = hm.lowerKey(last);
                if(secLast == null){
                    break;
                }

                sb.append(secLast);
                int secCount = hm.get(secLast);

                if(secCount == 1){
                    hm.remove(secLast);
                }else{
                    hm.put(secLast, secCount - 1);
                }
            }
        }

        return sb.toString();
    }
}