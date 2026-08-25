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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head,
            fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        while(prev != null){
            if(temp.val != prev.val){
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }

        return true;
        // ListNode slow = head, 
        //     fast = head;
        
        // while(fast != null && fast.next != null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }

        // ListNode curr = slow;
        // ListNode prev = null;
        // ListNode next;
        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // ListNode firstPart = head;
        // ListNode secondPart = prev;
        // while(firstPart != null && secondPart != null){
        //     if(firstPart.val != secondPart.val){
        //         return false;
        //     }
        //     firstPart = firstPart.next;
        //     secondPart = secondPart.next;
        // }

        // return true;

        // ListNode slow = head, fast = head;

        // while(fast != null && fast.next != null){
        //     fast = fast.next.next; 
        //     slow = slow.next;
        // }

        // ListNode prev = null;
        // ListNode curr = slow;
        // ListNode next;
        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // ListNode i = head;
        // while(prev != null){
        //     if(i.val != prev.val){
        //         return false;
        //     }
        //     i = i.next;
        //     prev = prev.next;
        // }

        // return true;
    }
}