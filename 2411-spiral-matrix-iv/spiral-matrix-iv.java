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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int a[][]=new int[m][];
        for(int i=0;i<m;i++){
            a[i]=new int[n];
            Arrays.fill(a[i],-1);
        }
        int tr=0,br=m-1,lc=0,rc=n-1;
       while(head!=null){
            for(int col=lc;col<=rc &&  head!=null;col++){
                a[tr][col]=head.val;
                head=head.next;
            }
            tr++;
            for(int row=tr;row<=br &&  head!=null;row++){
                a[row][rc]=head.val;
                head=head.next;
            }
            rc--;
            for(int col=rc;col>=lc && head!=null;col--){
                a[br][col]=head.val;
                head=head.next;
            }
            br--;
            for(int row=br;row>=tr && head!=null;row--){
                a[row][lc]=head.val;
                head=head.next;
            }
            lc++;
       }
       return a;
    }
}