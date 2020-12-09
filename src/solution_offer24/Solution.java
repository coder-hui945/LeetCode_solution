package solution_offer24;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
//        ListNode a = head.next,b = head,temp;
//        if (a == null)
//            return head;
//        b.next = null;
//        while (a != null){
//            temp = a;
//            a.next = b;
//            a = temp.next;
//            b = temp;
//        }
//        return b;
        if (head==null||head.next == null)return head;
        ListNode pre = null,p = head;
        while (p != null){
            ListNode tmp = p.next;
            p.next = pre;
            pre = p;
            p = tmp;
        }
        return pre;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node = reverseList(node1);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }


    }
}