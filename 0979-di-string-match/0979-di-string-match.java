class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int ans[] = new int[n+1];
        int l = 0;
        int h = n;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == 'I'){
                ans[i] = l++;
            }
            else{
                ans[i] = h--;
            }
        }
        ans[n] = l;
        return ans;
    }
}