class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int max = -1;
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for(int i = 0;i<n;i++){
              hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }
        for(int i : hm.keySet()){
             if(i == hm.get(i)){
                 max = Math.max(max , i);
             }
        }
        return max;
    }
}