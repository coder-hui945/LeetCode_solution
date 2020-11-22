package solution_offer32_1;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty())
        {
            TreeNode node  = queue.poll();
            if (node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
            ans.add(node.val);
        }
        int[] res =new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}