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
    int gcd(int n1,int n2){
        int min=Math.min(n1,n2);
        while(min>1){
            if(n1%min==0 && n2%min==0) return min;
            min--;
        }
        return 1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head.next,pre=head;
        while(pre.next!=null && temp!=null){
            int gcd1=gcd(pre.val,temp.val);
            ListNode newnode=new ListNode(gcd1);
            newnode.next=temp;
            pre.next=newnode;
            pre=temp;
            temp=temp.next;
        }
        return head;
    }
}