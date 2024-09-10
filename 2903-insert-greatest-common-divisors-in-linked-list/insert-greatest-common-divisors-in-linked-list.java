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
    int gcd(int a,int b){
       if(a == 1 || b==1){
            return 1;
        }
        while(b !=0){
            int rem = a % b;
            a = b;
            b= rem;
        }
        return a;
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