class Solution {
    // public static boolean validate(int arr[] , int l , int r){
    //     for(int i = l;i<r;i++){
    //         if(arr[i] == arr[i+1]){
    //            return false;
    //         }
    //     }
    //     return true;
    // }
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int nColors[] = new int[n+k-1];
        for(int i = 0;i<n;i++){
             nColors[i] = colors[i];
        }
        for(int i = 0 ;i<k-1;i++){
            nColors[n+i] = colors[i];
        }
        int count = 0;
        int i = 0;
        int j = 1;
        while(j < nColors.length){
            if(nColors[j] == nColors[j-1]){
                i = j;
                j++;
                continue;
            }
            j++;
            if(j-i<k){
                continue;
            }
            count++;
            i++;
        }
        return count;
        
    }
}