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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> ans = new ArrayList<>();
         if(root == null){
             return ans;
         }
         Queue<TreeNode> q = new ArrayDeque<>();
         q.offer(root);
         while(!q.isEmpty()){
             int s = q.size();
             double avg = 0.000000;
             for(int i = 0;i<s;i++){
                 TreeNode p = q.poll();
                 avg+=p.val;
                 if(p.left!=null) q.offer(p.left);
                 if(p.right!=null) q.offer(p.right);
             }
             ans.add(avg/s);
         }
         return ans;
    }
}