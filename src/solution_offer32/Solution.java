
package solution_offer32;

import java.util.*;

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

    //    List<List<Integer>> res=new ArrayList<>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        helper(root,0);
//        return res;
//    }
//
//    private void helper(TreeNode root,int level){
//        if(root==null)
//            return;
//        if(res.size()==level){
//            res.add(new ArrayList<>());
//        }
//        if(level%2==0){
//            res.get(level).add(root.val);
//
//        }else{
//            res.get(level).add(0,root.val);
//        }
//        helper(root.left,level+1);
//        helper(root.right,level+1);
//    }
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