package com.one7.more;

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Input: root = [3,9,20,null,null,15,7]
Output: 3

Input: root = [1,null,2]
Output: 2

 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Integer[] ele = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode node = buildTree(ele);
        int depth = maxDepth(node);
        System.out.println(depth);
    }

    private static TreeNode buildTree(Integer[] ele) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r) + 1;
    }
}
