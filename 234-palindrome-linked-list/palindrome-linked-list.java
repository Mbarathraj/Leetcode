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
    private static int [] a = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        final int[] arr = a;
        int size = 0;
       while(head!=null){
        arr[size++]=head.val;
        head=head.next;
       }
       int m = size/2;
       for (int i = 0 ; i< m;i++){
        if(arr[i]!=arr[--size]) return false;
       }
       return true;    
    }

}