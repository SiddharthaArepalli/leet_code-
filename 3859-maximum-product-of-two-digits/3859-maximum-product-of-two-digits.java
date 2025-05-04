class Solution {
    public int maxProduct(int n) {
        List<Integer> ls = new ArrayList<>();
        while(n>0){
            ls.add(n%10);
            n/=10;
        }
        int maxPro = Integer.MIN_VALUE;
        for(int i = 0;i<ls.size();i++){
            for(int j = i+1;j<ls.size();j++){
                maxPro = Math.max(maxPro , ls.get(i)*ls.get(j));
            }
        }
        return maxPro;
    }
}