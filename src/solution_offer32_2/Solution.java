package solution_offer32_2;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root)
//    {
//        Queue<TreeNode> queue = new LinkedList<>();
//        int size = 0;
//        List<List<Integer>> res = new ArrayList<>();
//        if(root == null)
//            return res;
//        queue.add(root);
//        while(!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.remove();
//                if(node.left != null)
//                    queue.add(node.left);
//                if (node.right!=null)
//                    queue.add(node.right);
//                list.add(node.val);
//            }
//            res.add(list);
//        }
//        return res;
//    }
    {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty())
        {
            count = queue.size();
            List<Integer> tmp = new LinkedList<>();
            for (int i = 1; i <= count; i++) {
                TreeNode node = queue.remove();
                tmp.add(node.val);
                if (node.left!=null)queue.add(node.left);
                if (node.right!=null)queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}