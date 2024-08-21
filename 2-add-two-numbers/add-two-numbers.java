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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
        ArrayList<Integer> al=new ArrayList<>();
        int c=0;
        ListNode head=null,tail=null;
        while(temp1!=null ||temp2!=null){
            if(temp1!=null && temp2!=null){
                int sum=temp1.val+temp2.val+c;
                al.add(sum%10);
                c=sum/10;
                temp1=temp1.next;
                temp2=temp2.next;
            }
           else{
            if(temp1!=null){
                int sum=temp1.val+c;
                al.add(sum%10);
                c=sum/10;
                temp1=temp1.next;
            }
            else{
                int sum=temp2.val+c;
                al.add(sum%10);
                c=sum/10;
                temp2=temp2.next;
            }
           }
           System.out.println("carry: "+c);
        }
        if(c>0) al.add(c);
        for(int i:al){
            if(head==null){
                head=tail=new ListNode(i);
            }
            else{
                ListNode newnode=new ListNode(i);
                tail.next=newnode;
                tail=newnode;
            }
        }
        return head;
    }
}