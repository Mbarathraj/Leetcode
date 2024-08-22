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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode h=null,tail=null;
        while(temp!=null){
           map.put(temp.val,map.getOrDefault(temp.val,0)+1);
           temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(map.get(temp.val)==1) {
                if(h==null){
                    h=tail=new ListNode(temp.val);
                }
                else{
                    ListNode newnode=new ListNode(temp.val);
                    tail.next =newnode;
                    tail=newnode;
                }
            }
            temp=temp.next;
        }
        return h;
    }
}