package solution_offer25;

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
//借助虚拟头节点  降低复杂度（无需判断特殊情况）
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dum = new ListNode(0),cur = dum;
//        while (l1 != null&&l2 != null){
//            if (l1.val <= l2.val){
//                cur.next = l1;
//                l1 = l1.next;
//            }else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        cur.next = l1 != null?l1:l2;
//        return dum.next;
        ListNode dump = new ListNode(0);
        ListNode cur = dump;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val){
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }else {
                cur.next = l1;
                l1=l1.next;
                cur = cur.next;
            }
        }
        cur.next = l1!=null?l1:l2;
        return dump.next;

    }
}