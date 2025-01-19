class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        // List<Integer> ls = new ArrayList<>();
        // for(int num : nums){
        //     ls.add(num);
        // }
        // int c = 0;
        // for(int i = 0;i<n;i++){
        //     int find = k - nums[i];
        //     if(ls.contains(find)){
        //         ls.remove(Integer.valueOf(find));
        //         ls.remove(Integer.valueOf(nums[i]));
        //         c++;
        //     }
        // }
        // return c;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int c = 0;
        for(int num : nums){
            int find = k - num;
            if(hm.getOrDefault(find,0) > 0){
                c++;
                hm.put(find,hm.get(find)-1);
            }
            else{
                hm.put(num,hm.getOrDefault(num,0)+1);
            }

        }
        return c;
    }
}