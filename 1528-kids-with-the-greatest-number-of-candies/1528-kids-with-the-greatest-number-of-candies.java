class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int n = candies.length;
        int temp[] = new int[n];
        for(int i = 0;i<n;i++){
            temp[i] = candies[i];
        }
        Arrays.sort(temp);
        for(int i = 0;i<n;i++){
            if(candies[i]+extraCandies >= temp[n-1]){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}