class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move `first` so that there's a gap of `n` between `first` and `second`
        for (int i = 0; i <= n; i++) {
            if (first == null) return head; // If n is greater than the number of nodes
            first = first.next;
        }

        // Move `first` to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Skip the desired node
        second.next = second.next.next;

        return dummy.next;
    }
}
