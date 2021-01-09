package solution_offer35;


import sun.rmi.runtime.NewThreadAction;

import java.util.HashMap;
import java.util.Map;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
//        if(head == null) return null;
//        Node cur = head;
//        Map<Node, Node> map = new HashMap<>();
//        // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
//        while(cur != null) {
//            map.put(cur, new Node(cur.val));
//            cur = cur.next;
//        }
//        cur = head;
//        // 4. 构建新链表的 next 和 random 指向
//        while(cur != null) {
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        // 5. 返回新链表的头节点
//        return map.get(head);
        if (head == null) return null;
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;

        }
        cur =head.next;
        Node pre = head,res = head.next;
        while (cur.next!=null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;

    }
}