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
    public static void accum(TreeNode node , List<Integer> leafs){
        if(node!=null){
            if(node.left == null && node.right==null){
                leafs.add(node.val);
            }
            accum(node.left,leafs);
            accum(node.right,leafs);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> al1 = new ArrayList<>();
       List<Integer> al2 = new ArrayList<>();
       accum(root1,al1);
       accum(root2,al2);
       return al1.equals(al2);
    }
}