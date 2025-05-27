/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     int count = 0;
//     public void dfs(TreeNode root , int maxSeen){
//         if(root == null) return;
//         if(root.val >= maxSeen){ 
//             count++;
//             maxSeen = root.val;
//         }
//         dfs(root.left , maxSeen);
//         dfs(root.right, maxSeen);
//     }
//     public int goodNodes(TreeNode root) {
//         int maxSeen = Integer.MIN_VALUE;
//         dfs(root , maxSeen);
//         return count;
//     }
// }

class Solution {
    public int dfs(TreeNode root, int maxSeen) {
        if (root == null) return 0;
        int count = 0;
        if (root.val >= maxSeen) {
            count = 1;
            maxSeen = root.val;
        }
        return count + dfs(root.left, maxSeen) + dfs(root.right, maxSeen);
    }

    public int goodNodes(TreeNode root) {
        int maxSeen = Integer.MIN_VALUE;
        return dfs(root, maxSeen);
    }
}