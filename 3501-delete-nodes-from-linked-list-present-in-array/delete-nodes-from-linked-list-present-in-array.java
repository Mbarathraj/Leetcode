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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=head;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode pre=null;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(pre==null)
                    head=head.next;
                else pre.next=temp.next;   
            }
            else
                pre=temp;
            temp=temp.next;
        }
            return head;
    }
}