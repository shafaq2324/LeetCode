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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            // iterate both lists till one of them dont end
            if(l1.val <= l2.val){
                curr.next = l1;
                // If l1's value is smaller, attach it to the merged list
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                // If l2's value is smaller, attach it to the merged list
                l2 = l2.next;
            }
            // move curr's pointer forward
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
            // if l1 remains then connect it directly to curr
        }

        if (l2 != null) {
            curr.next = l2;
            // if l2 remains then connect it directly to curr
        }
        return dummy.next;
    }
}