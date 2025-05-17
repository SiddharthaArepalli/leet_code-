class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int arr[] = new int[3];
        for(int i = 0;i<n;i++){
            arr[nums[i]]++;
        }
        int s = 0;
        for(int i = 0;i<arr.length;i++){
             for(int j = 0;j<arr[i];j++){
                 nums[s++] = i;
             }
        }
    }
}