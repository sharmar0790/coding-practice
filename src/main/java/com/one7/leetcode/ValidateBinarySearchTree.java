package com.one7.leetcode;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.

 */
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node_1 = new TreeNode(1, null, null);
        TreeNode node_4 = new TreeNode(4);
        root.left = node_1;
        root.right = node_4;
        TreeNode node_3 = new TreeNode(3, null, null);
        TreeNode node_6 = new TreeNode(6, null, null);
        root.right.left = node_3;
        root.right.right = node_6;

        TreeNode root_2 = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        boolean r = isValidBST(root_2);
        System.out.println(r);
    }

    public static boolean isValidBST(TreeNode root) {
        boolean b_l = false;
        boolean b_r = false;
        if (root == null) return true;
        if (root.left != null && root.left.val > root.val) return false;
        if (root.right != null && root.right.val < root.val) return false;

        b_l = isValidBST(root.left);
        b_r = isValidBST(root.right);
        return b_l && b_r;
    }

}

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
