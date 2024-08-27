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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        StringBuilder st=new StringBuilder();
        while(temp!=null){
            st.append(temp.val);
            temp=temp.next;
        }
        String str=st.toString();
        st=st.reverse();
        return str.equals(st.toString());

    }
}