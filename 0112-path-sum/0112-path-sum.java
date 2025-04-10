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
class Solution {
    public boolean check(TreeNode root , int target , int cur){
         if(root == null){
            return false;
         }
         cur+=root.val;
         if(root.left == null && root.right == null){
              return target == cur;
         }
         return check(root.left,target , cur) || check(root.right,target , cur);
    }
    public boolean hasPathSum(TreeNode root, int targetSum){
        int cur = 0;
        return check(root , targetSum , cur);
    }
}