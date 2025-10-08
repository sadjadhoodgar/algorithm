package org.train.tree;

/**
 * LeetCode #226 - Invert Binary Tree
 * Link: <a href="https://leetcode.com/problems/invert-binary-tree/">...</a>
 */
public class InvertTree {
    TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        solution(root.left);
        solution(root.right);

        return root;
    }
}
