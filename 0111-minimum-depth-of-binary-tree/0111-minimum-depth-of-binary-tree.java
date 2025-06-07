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
public class Solution {
    public int minDepth(TreeNode root) {
         if(root == null) return 0;
         int lefMin = minDepth(root.left);
         int rigMin = minDepth(root.right);
         return (lefMin == 0 || rigMin == 0)?lefMin+rigMin+1:Math.min(lefMin ,rigMin)+1;
    }
}