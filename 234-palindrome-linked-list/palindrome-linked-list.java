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
        int i=0,j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)) return false;
            i++;j--;
        }
        return true;

    }
}