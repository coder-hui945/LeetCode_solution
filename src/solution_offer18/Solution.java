package solution_offer18;

import java.time.temporal.Temporal;

//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode dumhead = new ListNode(-1);
        dumhead.next = head;
        ListNode tmp = dumhead;
        if (head==null)return head;
        while (tmp.next.val!=val){
            tmp = tmp.next;
        }
        if (tmp.next.next!=null){
            tmp.next = tmp.next.next;
        }else {
            tmp.next = null;
        }
        return dumhead.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteNode(node1,5);
        System.out.println("ssssssssssssss");
    }
}