class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            int curCount = 0;
            for(int j = 0;j<n;j++){
                    if(i!=j){
                        if(boxes.charAt(j) == '1'){
                            curCount+=Math.abs(j-i);
                        }
                    }
            }
            res[i] = curCount;
        }
        return res;
    }
}