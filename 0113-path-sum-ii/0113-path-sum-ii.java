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
    public static void findSum(TreeNode root , List<Integer> ls , List<List<Integer>> res, int tar , int cur){
         if(root == null){
             return;
         }
         ls.add(root.val);
         cur+=root.val;
         if(root.left == null && root.right == null && cur == tar) {
             res.add(new ArrayList<>(ls));
         }
         findSum(root.left , ls , res ,tar,  cur);
         findSum(root.right , ls , res ,tar  ,cur);
         ls.remove(ls.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        List<List<Integer>> res = new ArrayList<>();
        int cur = 0;
        findSum(root , new ArrayList<>() , res ,tar , cur);
        return res;
    }
}
