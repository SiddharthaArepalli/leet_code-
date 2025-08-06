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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return res;
        q.offer(root);
        while(!q.isEmpty()){
              int s = q.size();
              List<Integer>bl = new ArrayList<>();
              for(int i = 0;i<s;i++){
                 TreeNode p =  q.poll();
                 bl.add(p.val);
                 if(p.left!=null) q.offer(p.left);
                 if(p.right!=null) q.offer(p.right);
              }
              res.add(bl);
        }
        Collections.reverse(res);
        return res;
    }
}