/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        int sizeA = 0;
        int sizeB = 0;

        while(l1 != null){
            sizeA++;
            l1 = l1.next;
        }

        while(l2 != null){
            sizeB++;
            l2 = l2.next;
        }

        l1 = headA;
        l2 = headB;

        while(sizeA > sizeB){
            l1 = l1.next;
            sizeA--;
        } 

        while(sizeB > sizeA){
            l2 = l2.next;
            sizeB--;
        } 

        while(l1 != l2){
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }
}