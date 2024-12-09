class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        // brute 1 
        // int n = nums.length;
        // boolean[] res = new boolean[queries.length];
        // for (int j = 0; j < queries.length; j++) {
        //     int start = queries[j][0];
        //     int end = queries[j][1];
        //     boolean flag = true;
        //     for (int i = start; i < end; i++) {
        //         if (nums[i] % 2 == nums[i + 1] % 2) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     res[j] = flag;
        // }
        // return res;

          // brute 2

        // Set<Integer> violatingIndices = new HashSet<>();
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if ((nums[i] % 2 == nums[i + 1] % 2)) {
        //         violatingIndices.add(i);
        //     }
        // }
        // boolean res[] = new boolean[queries.length];
        //  for (int i = 0; i < queries.length; i++) {
        //     int from = queries[i][0];
        //     int to = queries[i][1];
        //     boolean isSpecial = true;

        //     for (int idx : violatingIndices) {
        //         if (idx >= from && idx < to) {
        //             isSpecial = false;
        //             break;
        //         }
        //     }

        //     res[i] = isSpecial;
        // }
        // return res;
        boolean[] ans = new boolean[queries.length];
        int[] pre = new int[nums.length];
        pre[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                pre[i] = pre[i - 1] + 1;
            } else {
                pre[i] = pre[i - 1];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            ans[i] = pre[end] - pre[start] == 0;
        }
        return ans;
        
    }
}