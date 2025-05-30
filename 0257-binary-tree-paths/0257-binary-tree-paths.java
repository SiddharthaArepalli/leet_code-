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
    public static void findPaths(TreeNode root , List<String> res , StringBuilder cur){
         if(root == null) return ;
         int len = cur.length();
         cur.append(root.val);
         if(root.left == null && root.right == null){
             res.add(cur.toString());
         }else{
            cur.append("->");
            findPaths(root.left , res , cur);
            findPaths(root.right , res , cur);
         }
         cur.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) { 
        List<String> res = new ArrayList<>();
        StringBuilder cur = new StringBuilder("");
        findPaths(root , res, cur);
        return res;
    }
}