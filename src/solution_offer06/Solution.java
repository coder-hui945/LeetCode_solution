package solution_offer06;

import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.Deque;
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

    public int[] reversePrint(ListNode head) {
        Stack<Integer> res = new Stack<>();
        int size = 0;
        while (head!=null){
            res.push(head.val);
            size ++;
            head = head.next;
        }
        int[] hh = new int[size];
        for (int i = 0; i < size; i++) {
            hh[i] = res.pop();
        }
        return hh;

    }
    ArrayList<Integer> temp = new ArrayList<>();
    public int[] reversePrint2(ListNode head) {
        recur(head);
        int[] res = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            res[i] = temp.get(i);
        }
        return res;
    }
    void recur(ListNode head){
        if(head == null)
            return;
        recur(head.next);
        temp.add(head.val);
    }
}