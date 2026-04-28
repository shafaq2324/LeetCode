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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
    
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        // slow and fast placed one after another
        ListNode prev = dummy;
        // prev to keep track of node before slow

        while(slow != null && fast != null){
            // if either becomes null then all the pairs are swapped
            slow.next = fast.next;
            fast.next = slow;
            prev.next = fast;

            prev = slow; // update prev every time
            slow = slow.next; // move slow forward

            if(slow != null){
                fast = slow.next; // move fast if there are more nodes remaining
            }else{
                fast = null; // otherwise make fast null
            }
        }
        return dummy.next;
    }
}