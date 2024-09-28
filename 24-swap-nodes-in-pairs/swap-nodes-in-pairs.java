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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode prev=head;
        ListNode temp=head.next;
        while(temp!=null){
            int val=prev.val;
            prev.val=temp.val;
            temp.val=val;
            if(temp.next!=null)
            {    prev=temp.next;
                 if(prev!=null)
                    temp=prev.next;
                 else break;
            }
            else break;
        }
        return head;
    }
}