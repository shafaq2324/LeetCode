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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        // placeholder in case head needs to be modified
        dummy.next = head; 
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i = 0; i < n; i++){
            fast = fast.next;
            // increment fast 'n' times so the distance between slow and fast is n
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
            // increment both while maintaining the gap so that slow is at n-1
        }
        slow.next = slow.next.next; 
        // break the link for nth node
        
        return dummy.next;

    }
}