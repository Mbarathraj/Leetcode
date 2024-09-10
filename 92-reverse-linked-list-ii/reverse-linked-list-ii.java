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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode rP=null,lP=null;
        int c=0;
        ArrayList<Integer> li=new ArrayList<>();
        while(temp!=null){
            if(c==left-1) lP=temp;
            if(c==right-1) rP=temp;
            if(lP!=null) li.add(temp.val);
            if(lP!=null && rP!=null) break;
            temp=temp.next;
            c++;
        }
        if(lP==rP) return head;
        temp=head;
        int c1=li.size()-1;c=0;
        while(temp!=null){
            if(c>=left-1 && c<=right-1) temp.val=li.get(c1--); 
            temp=temp.next;
            c++;
        }
        return head;

        
    }
}