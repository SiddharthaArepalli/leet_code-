class Solution {
    public boolean canArrange(int[] arr, int k) {
        // int n = arr.length;
        // int count = 0;
        // boolean vis[] = new boolean[n];
        // for(int i = 0;i<n;i++){
        //     if(vis[i]) continue;
        //     for(int j = i+1;j<n;j++){
        //           if(!vis[j] && (arr[i]+arr[j])%k == 0){
        //             count++;
        //             vis[i] =true;
        //             vis[j] = true;
        //             break;
        //           }
        //     }
        // }
        // System.out.println(count);
        // return count == n/2;
          

        int feq[] = new int[k];
        for(int i : arr){
            int r = i%k;
            if(r < 0){
                r+=k;
            }
            feq[r]++;
        }
        if(feq[0]%2!= 0){
            return false;
        }
        for(int i = 1;i<=k/2;i++){
            if(feq[i]!=feq[k-i]){
                return false;
            }
        }
  return true;
    }
}