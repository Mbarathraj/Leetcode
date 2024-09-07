/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    boolean find(ListNode head,ListNode cur,TreeNode root){
        if(cur==null) return true;
        if(root==null) return false;
        if(cur.val==root.val) cur=cur.next;
        else if(head.val==root.val) head=head.next;
        else cur=head;
        return find(head,cur,root.left) || find(head,cur,root.right); 
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
      return find(head,head,root);
    }
}