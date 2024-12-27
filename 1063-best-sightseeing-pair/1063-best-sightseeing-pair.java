class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE;
        int n = values.length;
        int m = values[0];
        for(int i = 1; i < values.length; i++){
            if (values[i] - i + m > ans) {
                ans = values[i] - i + m;
            } 
            if(values[i] + i > m){
                m = values[i] + i;
            }
        }
        return ans;
        
        // for(int i = 0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         int score =(values[i]+i)+(values[j]-j);
        //         if(score > ans){
        //             ans = score;
        //         }
        //     }
        // }
        // return ans;
    }
}