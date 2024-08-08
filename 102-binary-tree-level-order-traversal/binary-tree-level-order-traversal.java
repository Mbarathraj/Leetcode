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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> al = new ArrayList<>();
        if (root == null) return al;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Mark the end of the first level
        int c = 0; // Level counter
        
        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            
            if (temp == null) {
                // If queue is not empty, add a new list for the next level
                if (!q.isEmpty()) {
                    c++;
                    q.add(null); // Mark the end of the next level
                }
            } else {
                if (al.size() <= c) {
                    al.add(new ArrayList<>());
                }
                al.get(c).add(temp.val);
                
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
        
        return al;
    }

}