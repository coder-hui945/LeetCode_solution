package solution1290;

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

    int flag = 0;
    public int getDecimalValue(ListNode head) {
        if (head == null) return 0;
        return getDecimalValue(head.next) + (int) Math.pow(2, flag++) * head.val;

    }
}