class Solution {
    public int trap(int[] height) {
         int n = height.length;
         int prefMax[] = new int[n];
         int sufMax[] = new int[n];
         prefMax[0] = height[0];
         for(int i = 1;i<n;i++){
              prefMax[i] = Math.max(prefMax[i-1],height[i]); 
         }
         sufMax[n-1] = height[n-1];
         for(int i = n-2;i>=0;i--){
              sufMax[i] = Math.max(sufMax[i+1], height[i]);
         }
         int ans = 0;
         for(int i = 0;i<n;i++){
              ans+=Math.abs(Math.min(prefMax[i] , sufMax[i]) - height[i]);
         }
         return ans;
    }
}