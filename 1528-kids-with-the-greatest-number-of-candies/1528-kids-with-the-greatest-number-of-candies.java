class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int n = candies.length;
        List<Integer> nums = new ArrayList<>();
        for(int i : candies){
            nums.add(i);
        }
        int max = Collections.max(nums);
        for(int i = 0;i<n;i++){
            if(candies[i]+extraCandies >= max){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}