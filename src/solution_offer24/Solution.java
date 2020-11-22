package solution_offer24;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode a = head.next,b = head,temp;
        if (a == null)
            return head;
        b.next = null;
        while (a != null){
            temp = a;
            a.next = b;
            a = temp.next;
            b = temp;
        }
        return b;

    }
}