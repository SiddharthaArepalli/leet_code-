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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if (root == null) return res;
        q.offer(root);
        int flag = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode p = q.poll();
                l.add(p.val);
                if(p.left!=null) q.offer(p.left);
                if(p.right!=null) q.offer(p.right);
            }
            if(flag == 1){
               Collections.reverse(l);
            }
            res.add(l);
            flag = 1-flag;
        }
        return res;
    }
}