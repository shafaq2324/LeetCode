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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is on mid
        fast = slow;
        while (slow != null) {
            st.push(slow);
            slow = slow.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head != fast) {
            curr.next = head;
            head = head.next; // 1. Advance head BEFORE you attach the popped node
            curr = curr.next;

            if (!st.isEmpty()) {
                curr.next = st.pop();
                curr = curr.next; // 2. Advance curr to the popped node you just attached
            }
        }

        // 3. Attach the middle node(s) and terminate the list to prevent cycles
        curr.next = head; // Or fast, since head == fast now
        if (curr.next != null) {
            curr.next.next = null;
        }
    }
}