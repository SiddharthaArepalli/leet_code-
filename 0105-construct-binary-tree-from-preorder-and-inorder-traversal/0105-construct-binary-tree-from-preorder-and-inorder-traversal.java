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
    
    public static int find(int[] ino , int inSt , int inEnd, int preInd){
        for(int i = inSt;i<=inEnd;i++){
             if(ino[i] == preInd){
                 return i;
             }
        }
        return -1;
    }

    public static TreeNode bTree(int[] preo , int ino[] ,int inSt , int inEnd , int ind ){
        if(inSt > inEnd){
             return null;
        }
        TreeNode root = new TreeNode(preo[ind]);
        int pos = find(ino , inSt , inEnd, preo[ind]);
        root.left = bTree(preo , ino , inSt , pos-1 , ind+1);
        root.right = bTree(preo , ino , pos+1 , inEnd , ind+(pos-inSt+1));
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         int n = inorder.length;
         int inStart = 0;
         int inEnd = n-1;
         int ind = 0;
         return bTree(preorder, inorder , inStart , inEnd , ind);
    }
}