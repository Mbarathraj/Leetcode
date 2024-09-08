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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++; temp=temp.next;
        } 
       int extra=len%k;
       ListNode cur=head;
       ListNode []res=new ListNode[k];
        for(int i=0;i<k && cur!=null;i++){
            res[i]=cur;
            int partsize=(len/k)+(extra > 0 ? 1:0);
            System.out.print(partsize);
            for(int j=1;j<partsize;j++){
                cur=cur.next;
            } 
            ListNode next= cur.next;
            cur.next=null;
            cur=next;
            extra--;
        }
        return res;
    }
}