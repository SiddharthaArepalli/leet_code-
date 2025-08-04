class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0;
        int j = 0;
        int maxF = 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(j < n){
            hm.put(fruits[j] , hm.getOrDefault(fruits[j] , 0)+1);
            while(hm.size() > 2){
                hm.put(fruits[i] , hm.get(fruits[i])-1);
                if(hm.get(fruits[i]) == 0) hm.remove(fruits[i]);
                i++;
            }
            maxF = Math.max(j-i+1, maxF);
            j++;
        }
        return maxF;
    }
}