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
        public static void lot(TreeNode node , int depth , Map<Integer , List<Integer>> map){
            if(node == null){
                return; 
            }
            map.putIfAbsent(depth , new ArrayList<>());
            map.get(depth).add(node.val);
            lot(node.left , depth+1, map);
            lot(node.right , depth+1 , map);
        }
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<Integer> ls = new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
            HashMap<Integer , List<Integer>> hm = new HashMap<>();
            if (root == null) return res;
            lot(root , 0 , hm);
            for(int i = 0;i<hm.size();i++){
                List<Integer> ll = hm.get(i);
                res.add(new ArrayList<>(ll));
            }
            return res;
        }
}