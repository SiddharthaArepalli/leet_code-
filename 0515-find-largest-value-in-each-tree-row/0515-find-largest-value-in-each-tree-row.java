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
    public List<Integer> largestValues(TreeNode root) {
          Queue<TreeNode> qs = new LinkedList<>();
          qs.add(root);
          List<Integer> ans = new ArrayList<>();
          if(root == null){
            return new ArrayList<>();
          }
          while(!(qs.isEmpty())){
            int an = Integer.MIN_VALUE;
            int ls = qs.size();
            for(int i = 0;i<ls;i++){
                TreeNode cur = qs.poll();
                an = Math.max(an,cur.val);
                if(cur.left!=null){
                    qs.add(cur.left);
                }
                if(cur.right!=null){
                    qs.add(cur.right);
                }
            }
            ans.add(an);
          }
        return ans;
    }
}