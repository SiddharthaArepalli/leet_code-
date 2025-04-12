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
    public static boolean isSame(TreeNode r , TreeNode rs){
        if(r == null && rs == null){
             return true;
        }
        if(r == null || rs == null){
             return false;
        }
        if(r.val!=rs.val){
            return false;
        }
        return isSame(r.left , rs.left) && isSame(r.right , rs.right);
    }
    public boolean isSubtree(TreeNode r, TreeNode rs) {
        if(r == null){
            return false;
        }
        if(isSame(r, rs)){
            return true;
        }
        return isSubtree(r.left , rs) || isSubtree(r.right ,rs);  
    }
}