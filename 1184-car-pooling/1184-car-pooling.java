class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int df[] = new int[1000+1];
        for(int i = 0;i<n;i++){
            int c = trips[i][0];
            int st = trips[i][1];
            int end = trips[i][2];
            df[st]+=c;
            df[end]-=c;
        } 
        int cp = 0;
        for(int i = 0;i<=1000;i++){
            cp+= df[i];
            if(cp>capacity){
                 return false;
            }
        }  
        return true;
    }
}