package solution0202;

import javax.xml.soap.Node;
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

    public int kthToLast(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        int res = -1;
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        for (int i = 1; i <= k ; i++) {
            res = stack.pop();
        }
        return res;

    }

    public int kthToLast2(ListNode head, int k) {
        ListNode frontNode = head, behindNode = head;

        while (frontNode != null && k > 0) {

            frontNode = frontNode.next;
            k--;
        }

        while (frontNode != null) {

            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }

        return behindNode.val;
    }
}