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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null,tail=null;
        while(list1!=null|| list2!=null){
            if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(head==null) {
                    head=tail=new ListNode(list1.val);
                }
                else{
                    ListNode newnode=new ListNode(list1.val);
                    tail.next =newnode;
                    tail=newnode;
                }
                  list1=list1.next;
            }
            else{
                 if(head==null) {
                    head=tail=new ListNode(list2.val);
                }
                else{
                    ListNode newnode=new ListNode(list2.val);
                    tail.next =newnode;
                    tail=newnode;
                }
                  list2=list2.next;
            }
          
            }
            else{
                if(list1!=null){
                    if(head==null) {
                      head=tail=new ListNode(list1.val);
                    }
                else{
                    ListNode newnode=new ListNode(list1.val);
                    tail.next =newnode;
                    tail=newnode;
                }
                      list1=list1.next;
                }
                else if(list2!=null){
                if(head==null) {
                    head=tail=new ListNode(list2.val);
                }
                else{
                    ListNode newnode=new ListNode(list2.val);
                    tail.next =newnode;
                    tail=newnode;
                }
                      list2=list2.next;
                }
            }
        }
   return head;
    }
}