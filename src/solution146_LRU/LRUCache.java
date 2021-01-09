package solution146_LRU;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    int capacity;
    Map<Integer,Node> map;
    Node dummyHead;
    Node dummyTail;

    public LRUCache(int capacity) {
        this.capacity =capacity;
        map = new HashMap();
        dummyHead = new Node(-1,-1);
        dummyTail = new Node(-1,-1);
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        moveToTail(node);
        return node.value;
    }
    public void put(int key, int value) {
        if(get(key)!=-1){
            map.get(key).value=value;
            return;
        }
        Node node = new Node(key,value);
        map.put(key,node);
        moveToTail(node);
        if(map.size()>capacity){
            map.remove(dummyHead.next.key);
            dummyHead.next = dummyHead.next.next;
            dummyHead.next.pre = dummyHead;
        }
    }
    public void moveToTail(Node node){
        node.pre = dummyTail.pre;
        dummyTail.pre=node;
        node.pre.next = node;
        node.next = dummyTail;
    }
    public class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */