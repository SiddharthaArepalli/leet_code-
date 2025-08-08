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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
         if(root == null) return 0;
         Queue<TreeNode> q = new ArrayDeque<>();
         q.offer(root);
         while(!q.isEmpty()){
             List<Integer> ls = new ArrayList<>();
             int s = q.size();
             for(int i = 0;i<s;i++){
                  TreeNode p =  q.poll();
                  ls.add(p.val);
                  if(p.left!=null) q.offer(p.left);
                  if(p.right!=null) q.offer(p.right);
             }
             res.add(ls);
         }
         return res.get(res.size()-1).get(0);
    }
}