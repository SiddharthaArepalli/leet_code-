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
    
    public static TreeNode solve(int arr[] , int l , int r){
        if(l>r) return null;
        int mid = (l+r)/2;
        TreeNode ro = new TreeNode(arr[mid]);
        ro.left = solve(arr,l,mid-1);
        ro.right = solve(arr,mid+1,r);
        return ro;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums , 0, nums.length-1);
    }
}