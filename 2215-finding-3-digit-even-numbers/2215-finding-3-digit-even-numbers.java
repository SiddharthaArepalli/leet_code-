class Solution {
    public int[] findEvenNumbers(int[] dig) {
        int n = dig.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                    if((i!=j && j!=k && i!=k) && dig[i]!=0){
                        StringBuilder sb = new StringBuilder();
                        sb.append(dig[i]);
                        sb.append(dig[j]);
                        sb.append(dig[k]);
                        int num = Integer.parseInt(sb.toString());
                        if(num%2==0){
                        hs.add(num);
                        }
                    }
                }
            }
        }
        int res[] = new int[hs.size()];
        int i = 0;
        for(int nm : hs){
                res[i] = nm;
                i++;
        }
        Arrays.sort(res);
        return res;
    }
}