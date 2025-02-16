class Solution {
    public int[] constructDistancedSequence(int n) {
        boolean used[] = new boolean[n+1];
        int seq[] = new int[2*n-1];
        lrgValSeq(0, used , seq, n);
        return seq;
    }

    public static boolean lrgValSeq(int ind , boolean used[], int seq[],int n){
          while(ind <seq.length && seq[ind]!=0){
             ind++;
          }
          if(ind == seq.length){
            return true;
          }
          for(int i = n;i>=1;i--){
             if(used[i]){
                continue;
             }
             if(i == 1){
                seq[ind] = i;
                used[i] = true;
                if(lrgValSeq(ind+1, used, seq , n)){
                    return true;
                }
                seq[ind]=0;
                used[i] = false;
             }else if(ind+i<seq.length && seq[ind+i] == 0){
                seq[ind] = i;
                seq[ind+i] = i;
                used[i] = true;
                if(lrgValSeq(ind+1, used, seq , n)){
                    return true;
                }
                seq[ind]=0;
                seq[ind+i] = 0;
                used[i]  = false;
             }
          }
          return false;
    }
}