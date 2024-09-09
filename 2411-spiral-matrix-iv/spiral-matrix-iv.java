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
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(a[i],-1);
        }
        int tr=0,br=m-1,lc=0,rc=n-1;
       while(head!=null){
            for(int col=lc;col<=rc;col++){
                if(head==null) break;
                a[tr][col]=head.val;
                head=head.next;
            }
            tr++;
            for(int row=tr;row<=br;row++){
                if(head==null) break;
                a[row][rc]=head.val;
                head=head.next;
            }
            rc--;
            for(int col=rc;col>=lc;col--){
                if(head==null) break;
                a[br][col]=head.val;
                head=head.next;
            }
            br--;
            for(int row=br;row>=tr;row--){
               if(head==null) break;
                a[row][lc]=head.val;
                head=head.next;
            }
            lc++;
       }
       return a;
    }
}