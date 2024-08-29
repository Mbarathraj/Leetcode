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
    private int sum = 0;
    
    public void dfs(TreeNode node, int currentValue) {
        if (node == null) {
            return;
        }
        
        // Update the current value by shifting left and adding the current node's value
        currentValue = (currentValue << 1) | node.val;
        
        // If it's a leaf node, add the current value to the sum
        if (node.left == null && node.right == null) {
            sum += currentValue;
        }
        
        // Traverse left and right subtrees
        dfs(node.left, currentValue);
        dfs(node.right, currentValue);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
}
