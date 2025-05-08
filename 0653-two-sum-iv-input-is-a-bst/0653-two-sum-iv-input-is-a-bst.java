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
    public static boolean twoSum = false;
    public static HashSet<Integer> hs;
    public static void check(TreeNode root , int k){
        if(root == null){
            return;
        }
        if(hs.contains(k - root.val)){
            twoSum = true;
        }
        hs.add(root.val);
        check(root.left , k);
        check(root.right , k);
    }
    public boolean findTarget(TreeNode root, int k) {
        twoSum = false;
        hs = new HashSet<>();
        if(root == null){
            return false;
        }
        check(root , k);
        return twoSum;
    }
}