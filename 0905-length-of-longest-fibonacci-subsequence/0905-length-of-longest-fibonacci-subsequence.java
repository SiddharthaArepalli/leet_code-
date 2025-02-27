class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        int maxLen = 2;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int a = arr[i];
                int b = arr[j];
                int sum = a+b;
                int len = 2;
                while(hs.contains(sum)){
                    a = b;
                    b = sum;
                    sum = a+b;
                    len++;
                    maxLen = Math.max(len, maxLen);
                }
            }
        }
        return maxLen>=3?maxLen:0;
    }
}