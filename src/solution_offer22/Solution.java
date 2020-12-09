
package solution_offer22;

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


    public ListNode getKthFromEnd(ListNode head, int k) {
            //快慢指针
//        ListNode frontNode = head, behindNode = head;
//        while (frontNode != null && k > 0) {
//
//            frontNode = frontNode.next;
//            k--;
//        }
//
//        while (frontNode != null) {
//
//            frontNode = frontNode.next;
//            behindNode = behindNode.next;
//        }
//
//        return behindNode;
        if (k<=0||head==null)return null;
        ListNode p = head,prep = head;
        for (int i = 1; i <= k ; i++) {
            p = p.next;
        }
        while (p!=null){//注意此处指针指向null
            p = p.next;
            prep = prep.next;
        }
        return prep;

    }

    }
}