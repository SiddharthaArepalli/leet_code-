class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        // if( n ==  1 || n == 2){
        //     return Arrays.asList(nums);
        // }
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }
        Iterator it = hm.entrySet().iterator();
        for(Integer i : hm.keySet()){
            if(hm.get(i) > n/3){
                 ls.add(i);
            }
        }
       
        return ls;
    }
}