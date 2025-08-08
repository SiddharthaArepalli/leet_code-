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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sumList = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return 0;
        q.offer(root);
        while(!q.isEmpty()){
             List<Integer> ls = new ArrayList<>();
             int s = q.size();
             for(int i = 0;i<s;i++){
                  TreeNode p = q.poll();
                  ls.add(p.val);
                  if(p.left!=null) q.offer(p.left);
                  if(p.right!=null) q.offer(p.right);
             }
             long sum = 0;
             for(int i : ls){
                  sum+=i;
             }
             sumList.add(sum);
        }
        Collections.sort(sumList);
        if(sumList.size() >= k) return sumList.get(sumList.size()-k);
        return -1;
    }
}