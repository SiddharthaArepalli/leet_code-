class Solution {
    public int longestConsecutive(int[] nums) {
    int n = nums.length;
    if(n == 0){
        return 0;
    }
    Arrays.sort(nums);
    int cur = 0;
    int longest = 1;
    int lsSmaller = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(nums[i]-1 == lsSmaller){
             cur++;
            lsSmaller = nums[i];
        }
        else if( nums[i]!= lsSmaller){
            cur = 1;
            lsSmaller = nums[i];
        }
        longest = Math.max(cur , longest);
     }
       return longest; 
    }
}
//     Set<Integer> hs = new HashSet<>();
//     int longest = 1;
//     for(int i : nums){
//         hs.add(i);
//     }

//     for(int i : hs){
//         int count = 1;
//         if(!hs.contains(i-1)){
//             int x = i;
//             count = 1;
//             while(hs.contains(x+1)){
//                 x = x+1;
//                 count++;
//             }
//             longest = Math.max(count , longest);
//         }

//     }
//     return longest;
//     }
// }