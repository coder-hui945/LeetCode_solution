
package solution_offer34;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {//回溯回溯

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //    List<List<Integer>> res = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        path(root,sum);
//        return res;
//    }
//    public void path(TreeNode root,int tar){
//        if(root == null){
//            return;
//        }
//        path.add(root.val);
//        tar -= root.val;
//        if(tar==0&&root.left==null&&root.right==null)
//            res.add(new ArrayList<>(path));
//        path(root.left,tar);
//        path(root.right,tar);
//        path.remove(path.size()-1);
//    }
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        path(root,sum);
        return res;
    }

    private void path(TreeNode root, int tar) {
        if (root == null) return;
        path.add(root.val);
        tar -= root.val;
        if (tar==0&&root.left==null&&root.right==null)
            res.add(new ArrayList<>(path));
        path(root.left,tar);
        path(root.right,tar);
        path.remove(path.size()-1);
    }


}