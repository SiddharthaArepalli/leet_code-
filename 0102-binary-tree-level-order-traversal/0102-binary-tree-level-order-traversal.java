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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        TreeNode dum = new TreeNode(-1);
        if(root == null){
            return res;
        }
         q.offer(root);
         q.offer(dum);
         List<Integer> ls = new ArrayList<>();
         while(!q.isEmpty()){
              TreeNode p = q.poll();
              if(p == dum){
                  res.add(new ArrayList<>(ls));
                  ls.clear();
                  if(!q.isEmpty()){
                     q.offer(dum);
                  }
                  continue;
              }
              ls.add(p.val);
              if(p.left!=null) q.offer(p.left);
              if(p.right!=null) q.offer(p.right);
         }
         return res;
    }
}