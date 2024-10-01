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
    TreeNode root1=null;
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        root1=insert(root.val,root1);
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return root1;
    }
    public TreeNode insert(int val,TreeNode root){
        if(root==null){
            TreeNode node=new TreeNode(val,null,null);
            return node;
        }
        root.right = insert(val,root.right);
        return root;
    }
}