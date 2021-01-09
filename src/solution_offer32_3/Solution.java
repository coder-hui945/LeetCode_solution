package solution_offer32_3;

import java.util.*;

//Definition for a binary tree node.
 class TreeNode {
    int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        int count = 0;
        int flag = 0;
        deque.add(root);
        while (!deque.isEmpty()){
            List<Integer> list = new ArrayList<>();
            TreeNode node = null;
            count = deque.size();
            for (int i = 0; i < count; i++) {
                if (flag == 0){
                    node = deque.removeFirst();
                    list.add(node.val);
                    if (node.left!=null)deque.addLast(node.left);
                    if (node.right!=null)deque.addLast(node.right);
                }else {
                    node = deque.removeLast();
                    list.add(node.val);
                    if (node.right!=null)deque.addFirst(node.right);
                    if (node.left!=null)deque.addFirst(node.left);
                }
            }
            res.add(list);
            if (flag==0){
                flag=1;
            }else {
                flag=0;
            }
        }
        return res;
    }
}