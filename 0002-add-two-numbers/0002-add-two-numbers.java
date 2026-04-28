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
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        // as addition begins from the right end
        while(l1 != null || l2 != null || carry != 0){
            // till the lists exhaust or carry becomes zero
            int sum = carry; // every time add carry to sum as first step
            if(l1 != null){
                // if l1 has not yet ended then add its value to sum and move the pointer
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                // if l2 has not yet ended then add its value to sum and move the pointer
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum%10); 
            // the result list stores the mod of the sum
            curr = curr.next; 
            carry = sum/10; 
        }
        return dummy.next;
    }
}