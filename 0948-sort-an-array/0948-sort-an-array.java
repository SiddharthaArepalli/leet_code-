class Solution {
    public static void mergeSort(int nums[] , int low , int high){
        if(low == high){
            return;
        }
        int mid = low+((high-low)/2);
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        mergeSortedHalves(nums, low,high);
    }
    public static void mergeSortedHalves(int nums[], int low , int high){
       int mid = low+((high-low)/2);
       int p1 = low;
       int p2 = mid+1;
       int k = 0;
       int temp[] = new int[high-low+1];
       while(p1<=mid && p2<=high){
           if(nums[p1]<nums[p2]){
               temp[k++] = nums[p1++];
           }
           else{
              temp[k++] = nums[p2++];
           }
       } 
       while(p1<=mid){
         temp[k++] = nums[p1++];
       }
       while(p2<=high){
         temp[k++] = nums[p2++];
       }
       for(int i = 0;i<high-low+1;i++){
          nums[low+i] = temp[i];
       }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0,n-1);
        return nums;
    }
}