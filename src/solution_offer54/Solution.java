package solution_offer54;

import java.util.Stack;

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

    private int ans = 0, count = 0;
    public int kthLargest(TreeNode root, int k) {
        // clarification:  root == null?   k <= 1?
        helper(root, k);
        return ans;
    }

    private void helper(TreeNode root, int k) {
        if (root.right != null) helper(root.right, k);

        if (++count == k) {
            ans = root.val;
            return;
        }

        if (root.left != null) helper(root.left, k);
    }

}