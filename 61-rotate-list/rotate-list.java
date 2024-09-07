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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp=head;
        int t=0;
        while(temp!=null){
            t++;
            temp=temp.next;
        }
        if(t==1 || t-k==0) return head;
        int t1=t-(k%t);
        if(t1==t) return head;
        ListNode prev=null;
        temp=head;
        if(t1==0) return head;
        while(t1>0){
            t1--;
            prev=temp;
            temp=temp.next;
        }
        if(prev!=null)prev.next=null;
        ListNode h1=temp;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=h1;
        return head;
    }
}