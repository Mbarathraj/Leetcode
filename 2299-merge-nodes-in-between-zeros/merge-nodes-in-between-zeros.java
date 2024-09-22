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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode cur=null,tail=null;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                ListNode newnode=new ListNode(sum,null);
                if(cur==null){
                    cur=tail=newnode;
                }
                else {
                    tail.next=newnode;
                    tail=newnode;
                }
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
            return cur;
    }
}